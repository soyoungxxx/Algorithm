import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        int[][] arr = new int[n][m];
        int[][] distance = new int[n][m];
        int start_i = 0, start_j = 0;
        for (int i = 0; i < n; i++) {
            inputs = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(inputs[j]);
                if (arr[i][j] == 2) {
                    start_i = i;
                    start_j = j;
                    distance[i][j] = 0;
                }
                else if (arr[i][j] == 0) distance[i][j] = 0;
                else distance[i][j] = -1;
            }
        } // 입력
        // start_i, start_j부터 시작...
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start_i, start_j});
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentI = current[0];
            int currentJ = current[1];
            for (int i = 0; i < 4; i++) {
                int dI = currentI + dx[i];
                int dJ = currentJ + dy[i];
                if (dI < 0 || dJ < 0 || dI >= n || dJ >= m) continue;
                if (distance[dI][dJ] == -1) {
                    queue.add(new int[]{dI, dJ});
                    distance[dI][dJ] = distance[currentI][currentJ] + 1;
                }
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(distance[i][j] + " ");
            }
            System.out.println();
        }
    }
}