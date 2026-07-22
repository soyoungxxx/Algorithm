import java.util.*;

class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        
        // 플로이드 - 워셜
        // 정확한 순위 > 모두와 경기 기록이 있거나, 순위가 있는 사람과 경기를 해서 기록이 생기거나..
        // 플로이드 워셜로 전체 승패여부를 가리고
        long INF = Long.MAX_VALUE / 4;
        long[][] winner = new long[n+1][n+1]; // 0이 1한테 이기면 1, 지면 -1, 모르면 INF
        for (int i = 1; i <= n; i++) {
            Arrays.fill(winner[i], INF);
            winner[i][i] = 0;
        }
        for (int i = 0; i < results.length; i++) {
            int from = results[i][0];
            int to = results[i][1];
            winner[from][to] = 1;
            winner[to][from] = -1;
        }
        for (int middle = 1; middle <= n; middle++) {
            for (int start = 1; start <= n; start++) {
                for (int end = 1; end <= n; end++) {
                    long first = winner[start][middle];
                    long second = winner[middle][end];
                    if (first == INF || second == INF) continue;
                    else if (first == 1 && second == 1) {
                        winner[start][end] = 1;
                        winner[end][start] = -1;
                    }
                    
                }
            }
        }
        
        for (int i = 1; i<= n; i++ ){
            boolean flag = true;
            for (int j = 1; j <= n; j++) {
                if (winner[i][j] == INF) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer++;
        }
        
        return answer;
    }
}