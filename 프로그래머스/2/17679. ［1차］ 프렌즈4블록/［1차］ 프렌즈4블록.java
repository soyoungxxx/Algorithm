class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        boolean[][] isCounted = new boolean[m][n];
        char[][] blocks = new char[m][n];

        int[] dy = {0, 1, 1, 0};
        int[] dx = {1, 0, 1, 0};
        
        int sameBlockCount = -1;

        for (int i = 0; i < m; i++) {
            blocks[i] = board[i].toCharArray();
        }
        
        while (sameBlockCount != 0) {
            sameBlockCount = 0;
            
            // 지울 수 있는 블럭 카운트
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    int count = 0;
                    if (blocks[i][j] != '0') {
                        for (int d = 0; d < 3; d++) {
                            int y = i + dy[d];
                            int x = j + dx[d];

                            if (blocks[i][j] == blocks[y][x]) {
                                count += 1;
                            }
                        }
                        if (count == 3) {
                            sameBlockCount += 1;
                            for (int d = 0; d < 4; d++) {
                                int y = i + dy[d];
                                int x = j + dx[d];

                                if (!isCounted[y][x]) {
                                    isCounted[y][x] = true;
                                    answer += 1;
                                }
                            }
                        }
                    }
                }
            }
            // 블럭 지우고 옮기기
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (isCounted[i][j]) {
                        isCounted[i][j] = false;
                        for (int k = i - 1; k >= 0; k--) {
                            blocks[k+1][j] = blocks[k][j];
                            blocks[k][j] = '0';
                        }
                    }
                }
            }
            
            
        }
        
        
        return answer;
    }
}