import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int answer = 0;
        Character[][] arr = new Character[N][M];
        Queue<int[]> queue = new LinkedList<>();
        boolean visited[][] = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = input.charAt(j);
                if (arr[i][j] == 'I') {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        } // 입력
        int di[] = {1, 0, -1, 0};
        int dj[] = {0, 1, 0, -1};
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentI = current[0];
            int currentJ = current[1];
            for (int d = 0; d < 4; d++) {
                int i = currentI + di[d];
                int j = currentJ + dj[d];
                if (i >= 0 && j >= 0 && i < N && j < M && visited[i][j] == false) {
                    if (arr[i][j] == 'O') {
                        visited[i][j] = true;
                        queue.add(new int[]{i, j});
                    } else if (arr[i][j] == 'P') {
                        visited[i][j] = true;
                        queue.add(new int[]{i, j});
                        answer += 1;
                    }
                }
            }
        }
        if (answer == 0) {
            System.out.println("TT");
        } else System.out.println(answer);
    }
}