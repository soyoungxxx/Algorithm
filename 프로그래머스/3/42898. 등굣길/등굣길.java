class Solution {
    public long solution(int m, int n, int[][] puddles) {
        long MOD = 1000000007;
        
        long[][] roads = new long[n+1][m+1];
        
        for (int i = 0; i < puddles.length; i++) {
            int y = puddles[i][0];
            int x = puddles[i][1];
            roads[x][y] = -1;
        }
        
        // 가로, 세로 먼저 채우기
        boolean flag = true;
        for (int j = 2; j <= m; j++) {
            if (!flag) {
                roads[1][j] = 0;
                continue;
            }
            else if (roads[1][j] == -1) {
                flag = false;
                roads[1][j] = 0;
                continue;
            }
            roads[1][j] = 1;
        }
        flag = true;
        for (int i = 2; i <= n; i++) {
            if (!flag) {
                roads[i][1] = 0;
                continue;
            }
            else if (roads[i][1] == -1) {
                flag = false;
                roads[i][1] = 0;
                continue;
            }
            roads[i][1] = 1;
        }
        
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= m; j++) {
                if (roads[i][j] == -1) roads[i][j] = 0;
                else {
                    roads[i][j] = (roads[i-1][j] + roads[i][j-1]) % MOD;
                }
            }
        }
        
        return roads[n][m];
    }
}