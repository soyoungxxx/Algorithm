import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        int[][] towns = new int[N+1][N+1];
        int distance[] = new int[N+1];
        
        for (int i = 1; i <= N; i++) {
            if (i == 1) distance[i] = 0;
            else distance[i] = Integer.MAX_VALUE;
        } // 거리 초기화
        
        for (int i = 0; i < road.length; i++) {
            int a = road[i][0];
            int b = road[i][1];
            int time = road[i][2];
            if (towns[a][b] != 0) {
                time = Math.min(time, towns[a][b]);
            } // 중복 값이 들어오면 최솟값만 사용
            towns[b][a] = time;
            towns[a][b] = time; // 걸리는 시간 저장
        }
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            for (int i = 2; i <= N; i++) {
                int w = towns[currentNode][i];
                if (w != 0) { // 현재 노드와 인접해있는 노드
                    int compareDistance = w + distance[currentNode];
                    // 지금까지의 거리 측정
                    if (distance[i] > compareDistance) {
                        distance[i] = compareDistance;
                        queue.add(i);
                    }
                }
            }
        }
        
        for (int i = 1; i <= N; i++) { // 조건 만족하는 값 찾기
            if (distance[i] <= K) answer += 1;
        }

        return answer;
    }
}