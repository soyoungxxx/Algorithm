import java.util.*;

class Solution {
    public int solution(int n, int[][] edges) {
        int answer = 0;
        int maxEdgeNum = 0;
        
        int INF = Integer.MAX_VALUE;
        int[] distance = new int[n+1];
        Arrays.fill(distance, INF);
        
        List<Integer>[] graph = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] edge : edges) {
            int key = edge[0];
            int value = edge[1];
            graph[key].add(value);
            graph[value].add(key);
         } // 인접 리스트 저장
        
        // 1번 노드부터 시작해서 distance 갱신
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        distance[1] = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int currentDistance = distance[current];
            for (int node : graph[current]) {
                if (distance[node] > currentDistance + 1) {
                    distance[node] = currentDistance + 1;
                    queue.offer(node);
                    
                    if (distance[node] > maxEdgeNum) {
                        maxEdgeNum = distance[node];
                    }
                }
            }
        }
        
        for (int dist : distance) {
            if (maxEdgeNum == dist) answer += 1;
        }
        
        return answer;
    }
}