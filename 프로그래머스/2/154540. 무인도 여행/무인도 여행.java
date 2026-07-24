import java.util.*;

class Solution {
    public List<Integer> solution(String[] maps) {
        List<Integer> answer = new ArrayList<>();
        
        int n = maps.length;
        int m = maps[0].length();
        
        boolean[][] isVisited = new boolean[n][m];
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!isVisited[i][j] && maps[i].charAt(j) != ('X')) {
                    isVisited[i][j] = true;
                    
                    int sum = Character.getNumericValue(maps[i].charAt(j));
                    
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.offer(new int[]{i, j});
                    
                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();
                        
                        int currentY = current[0];
                        int currentX = current[1];
                        
                        for (int d = 0; d < 4; d++) {
                            int x = currentX + dx[d];
                            int y = currentY + dy[d];
                            
                            if (x >= 0 && y >= 0 && x < m && y < n) {
                                if (maps[y].charAt(x) != ('X') && !isVisited[y][x]) {
                                    isVisited[y][x] = true;
                                    sum += Character.getNumericValue(maps[y].charAt(x));
                                    queue.offer(new int[]{y, x});
                                }
                            }
                        }
                    }
                    answer.add(sum);
                }
            }
        }
        if (answer.size() == 0) answer.add(-1);
        Collections.sort(answer);
        return answer;
    }
}