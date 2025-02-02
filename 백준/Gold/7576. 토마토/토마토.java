import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int M = Integer.parseInt(inputs[0]);
        int N = Integer.parseInt(inputs[1]);
        int[][] tomatoes = new int[N][M];
        int index_i = 0, index_j = 0;
        for (int i = 0; i < N; i++) {
            inputs = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                tomatoes[i][j] = Integer.parseInt(inputs[j]);
                if (tomatoes[i][j] == 1) {
                    index_i = i;
                    index_j = j;
                }
            }
        } // 입력

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        int prev_cnt = 0, new_cnt = 0, answer = 0;
        Queue<int[]> queue = new LinkedList<>();

        // 안 익은 토마토 세기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomatoes[i][j] == 0) prev_cnt++;
                else if (tomatoes[i][j] == 1) queue.add(new int[]{i, j, 0});
            }
        }

        // 토마토 익히기
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curI = cur[0];
            int curJ = cur[1];
            int days = cur[2];

            for (int d = 0; d < 4; d++) {
                int newI = curI + dx[d];
                int newJ = curJ + dy[d];
                if (newI < 0 || newI >= N || newJ < 0 || newJ >= M) continue;
                if (tomatoes[newI][newJ] == 0) {
                    tomatoes[newI][newJ] = 1;
                    new_cnt++;
                    queue.add(new int[]{newI, newJ, days + 1});
                }
            }
            answer = days;
        }

        if (prev_cnt == new_cnt) System.out.println(answer);
        else System.out.println(-1);
    }
}