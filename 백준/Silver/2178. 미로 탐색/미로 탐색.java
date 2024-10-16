import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int[][] maze = new int[N][M];

        for (int i = 0; i < N; i++) {
            inputs = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(inputs[j]);
            }
        } // 입력 완료

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        int[][] distance = new int[N][M]; // 필요한 변수 선언

        distance[0][0] = 1;
        queue.add(new int[]{0, 0});
        visited[0][0] = true; // 초기화

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int currentI = current[0];
            int currentJ = current[1];

            for (int d = 0; d < 4; d++) {
                int i = currentI + dx[d];
                int j = currentJ + dy[d];
                if (i >= 0 && j >= 0 && i < N && j < M) {
                    if (visited[i][j] == false && maze[i][j] == 1) {
                        queue.add(new int[]{i, j});
                        visited[i][j] = true;
                        distance[i][j] = distance[currentI][currentJ] + 1;
                    }
                }
            }
        }
        bw.write(Integer.toString(distance[N-1][M-1]));
        bw.flush();
        bw.close();
    }
}