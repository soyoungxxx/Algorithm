import java.util.*;

class Solution {
    Set<Integer> gateSet = new HashSet<>();
    Set<Integer> summitSet = new HashSet<>();
    List<int[]>[] graph;
    
    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        int INF = Integer.MAX_VALUE;
        int[] answer = {INF, INF};
        
        // 0. HashSet 초기화
        for (int gate : gates) gateSet.add(gate);
        for (int summit : summits) summitSet.add(summit);
        
        // 1. 간선 정보 연결리스트로 변경해 저장
        graph = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
        for (int[] path : paths) {
            int start = path[0];
            int end = path[1];
            int weight = path[2];
            graph[start].add(new int[]{end, weight});
            graph[end].add(new int[]{start, weight});
        }
        
        // 2. Priority Queue - 다익스트라
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        
        // 3. distance setting
        int[] distance = new int[n+1];
        Arrays.fill(distance, INF);
        for (int gate : gateSet) {
            distance[gate] = 0;
            queue.offer(new int[]{gate, 0});
        }
        
        // 4. distance 채우기
        while (!queue.isEmpty()) {
            int[] info = queue.poll();
            int current = info[0], currentMaxDistance = info[1];
            
            if (distance[current] < currentMaxDistance) continue;
            if (summitSet.contains(current)) continue;
            
            for (int[] edge : graph[current]) {
                int next = edge[0], weight = edge[1];

                if (gateSet.contains(next)) continue;
                int newCost = Math.max(weight, currentMaxDistance);
                if (newCost < distance[next]) {
                    distance[next] = newCost;
                    queue.offer(new int[]{next, newCost});
                }
            }
        }
        
        // 5. 봉우리별 distance 비교해서 min값 찾기
        for (int summit : summitSet) {
            if (distance[summit] < answer[1]) {
                answer[1] = distance[summit];
                answer[0] = summit;
            }
            else if (distance[summit] == answer[1] && summit < answer[0]) {
                answer[0] = summit;
            }
        }
        
        return answer;
    }
}