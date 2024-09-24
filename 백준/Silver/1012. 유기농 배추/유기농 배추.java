import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        for (int t = 0; t < T; t++) {
            int answer = 0;
            String[] inputs = br.readLine().split(" ");
            int M = Integer.parseInt(inputs[0]);
            int N = Integer.parseInt(inputs[1]);
            int K = Integer.parseInt(inputs[2]);
            boolean[][] visited = new boolean[M][N];
            int[][] field = new int[M][N];
            for (int j = 0; j < K; j++) {
                inputs = br.readLine().split(" ");
                int a = Integer.parseInt(inputs[0]);
                int b = Integer.parseInt(inputs[1]);
                field[a][b] = 1;
            }
            Queue<int[]> queue = new LinkedList<>();
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (field[i][j] == 1 && visited[i][j] == false) {
                        visited[i][j] = true;
                        queue.add(new int[]{i, j});
                        while (!queue.isEmpty()) {
                            int[] current = queue.poll();
                            int current_x = current[0];
                            int current_y = current[1];
                            for (int d = 0; d < 4; d++) {
                                int x = current_x + dx[d];
                                int y = current_y + dy[d];
                                if (x >= 0 && y >= 0 && x < M && y < N) {
                                    if (field[x][y] == 1 && visited[x][y] == false) {
                                        visited[x][y] = true;
                                        queue.add(new int[]{x, y});
                                    }
                                }
                            }
                        }
                        answer += 1;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}