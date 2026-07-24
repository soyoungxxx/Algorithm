import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        
        int n = maps.length;
        int m = maps[0].length;
        
        int[][] distance = new int[n][m];
        boolean[][] isVisited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(distance[i], -1);
            Arrays.fill(isVisited[i], false);
        }
        // 필요한 변수 초기화
        
        distance[0][0] = 1; // 시작점
        isVisited[0][0] = true;
        
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            int currentY = current[0];
            int currentX = current[1];
            int currentDistance = distance[currentY][currentX];
            
            for (int i = 0; i < 4; i++) {
                int y = currentY + dy[i];
                int x = currentX + dx[i];
                
                if (y >= 0 && x >= 0 && y < n && x < m) {
                    if (maps[y][x] == 1 && !isVisited[y][x]) {
                        isVisited[y][x] = true;
                        distance[y][x] = currentDistance + 1;
                        queue.offer(new int[]{y, x});
                    }
                }
            }
        }
        
        answer = distance[n-1][m-1];
        
        return answer;
    }
}