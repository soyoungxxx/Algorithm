import java.util.*;

class Solution {
    public long solution(int n, int s, int a, int b, int[][] fares) {
        final long INF = Long.MAX_VALUE / 4;
        long[][] distance = new long[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(distance[i], INF);
            distance[i][i] = 0;
        }
        for (int[] edge : fares) {
            int from = edge[0];
            int to = edge[1];
            int value = edge[2];
            
            distance[from][to] = Math.min(distance[from][to], value);
            distance[to][from] = distance[from][to];
        } // 간선 정보 저장
        
        // 플로이드-워셜
        for (int middle = 1; middle <= n; middle++) {
            // 중간에 거치는 수
            for (int start = 1; start <= n; start++) {
                for (int end = 1; end <= n; end++) {
                    if (distance[start][middle] == INF || distance[middle][end] == INF) continue;
                    long newDistance = distance[start][middle] + distance[middle][end];
                    if (newDistance < distance[start][end]) {
                        distance[start][end] = newDistance;
                        distance[end][start] = newDistance;
                    }
                }
            }
        }
        
        long min = INF;
        for (int i = 1; i <= n; i++) {
            // s ->, -> a, -> b
            long sum = distance[s][i] + distance[i][a] + distance[i][b];
            if (sum < min) min = sum;
        }
        
        return min;
    }
}