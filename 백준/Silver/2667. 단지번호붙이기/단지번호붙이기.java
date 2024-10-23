import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] house = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                house[i][j] = Integer.parseInt(inputs[j]);
            }
        } // 입력

        int cnt = 0;
        int answer = 1;
        List<Integer> list = new ArrayList<>();
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        boolean[][] visited = new boolean[N][N];
        Queue<int[]> queue = new LinkedList<>(); // 변수 선언

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (house[i][j] == 1 && !visited[i][j]) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;

                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();
                        int currentI = current[0];
                        int currentJ = current[1];
                        for (int d = 0; d < 4; d++) {
                            int x = currentI + dx[d];
                            int y = currentJ + dy[d];
                            if (x >= 0 && y >= 0 && x < N && y < N) {
                                if (house[x][y] == 1 && !visited[x][y]) {
                                    queue.add(new int[]{x, y});
                                    visited[x][y] = true;
                                    answer += 1;
                                }
                            }
                        }
                    }
                    list.add(answer);
                    cnt += 1; answer = 1;
                }
            }
        }
        bw.write(cnt + "\n");
        Collections.sort(list);
        for (int num : list) {
            bw.write(num + "\n");
        }
        bw.flush();
        bw.close();
    }
}