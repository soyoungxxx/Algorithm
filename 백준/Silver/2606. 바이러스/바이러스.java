import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[][] arr = new int[N + 1][N + 1];
        boolean[] visited = new boolean[N+1];
        int answer = 0;
        Arrays.fill(visited, false);
        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (visited[num]) continue;
            visited[num] = true;
            for (int i = 1; i <= N; i++) {
                if (arr[num][i] == 1) queue.add(i);
            }
        }

        for (int i = 2; i <= N; i++) {
            if (visited[i]) {
                answer += 1;
            }
        }

        System.out.println(answer);
    }
}