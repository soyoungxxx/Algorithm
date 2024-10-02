import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int[][] graph = new int[N+1][N+1];
        for (int i = 0; i < M; i++) {
            inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            graph[a][b] = 1;
            graph[b][a] = 1;
        } // 그래프 입력 받음

        Queue<Integer> queue = new LinkedList<>();
        boolean[] isVisited = new boolean[N + 1];
        int count = 0;
        // 필요한 자료구조 선언

        for (int i = 1; i <= N; i++) {
            if (isVisited[i]) continue; // 만약 이미 순회한 라인이라면 패스
            for (int j = 1; j <= N; j++) {
                if (graph[i][j] == 1) {
                    queue.add(i);
                    isVisited[i] = true;

                    while (!queue.isEmpty()) {
                        int index = queue.poll();
                        for (int k = 1; k <= N; k++) {
                            if (graph[index][k] == 1 && !isVisited[k]) {
                                queue.add(k);
                                isVisited[k] = true;
                            }
                            graph[i][k] = 0;
                        }
                    }
                    // while 한 번 돌 때마다 하나의 연결이 완성되기 때문에
                    count += 1;
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            if (!isVisited[i]) count += 1;
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}
