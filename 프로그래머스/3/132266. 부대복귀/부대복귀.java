import java.util.*;

class Solution {
    public List<Integer> solution(int n, int[][] roads, int[] sources, int destination) {
        List<Integer> answer = new ArrayList<>();
        
        // 어쨌든 각 sources 부터 destination까지 가는 최단 경로 찾기
        // BFS
        // roads를 인접 리스트로 바꾸고 큐에 넣어서 확인
        
        List<Integer>[] graph = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] road : roads) {
            int from = road[0];
            int to = road[1];
            graph[from].add(to);
            graph[to].add(from);
        } // 인접 리스트 생성
        
        for (int source : sources) {
            // source -> destination
            boolean[] isVisited = new boolean[n+1];
            int[] distance = new int[n+1];
            for (int i = 1; i <= n; i++) {
                distance[i] = -1;
            } // 초기화
            
            Queue<Integer> queue = new ArrayDeque<>();
            queue.offer(source);
            distance[source] = 0;
            isVisited[source] = true;
            while (!queue.isEmpty()) {
                int current = queue.poll();
                List<Integer> list = graph[current];
                for (int num : list) {
                    if (!isVisited[num]) {
                        queue.offer(num);
                        distance[num] = distance[current] + 1;
                        isVisited[num] = true;
                    }
                }
            }
            answer.add(distance[destination]);
        }
        
        return answer;
    }
}