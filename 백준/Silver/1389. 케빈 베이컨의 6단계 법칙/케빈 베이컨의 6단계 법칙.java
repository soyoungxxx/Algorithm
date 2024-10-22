import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int[][] users = new int[N+1][N+1];
        for (int i = 0; i < M; i++) {
            inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            users[a][b] = 1;
            users[b][a] = 1;
        } // 입력 및 변수 초기화

        int minValue = Integer.MAX_VALUE;
        int minIndex = 1;
        for (int i = 1; i <= N; i++) {
            int value = findBacon(i, users);
            if (minValue > value) {
                minValue = value;
                minIndex = i;
            }
        }

        bw.write(Integer.toString(minIndex));
        bw.flush();
        bw.close();
    }

    private static int findBacon(int start, int[][] users) {
        int N = users.length - 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        int[] distance = new int[N+1];
        for(int i = 1; i <= N; i++) {
            if (i == start) distance[i] = 0;
            else distance[i] = Integer.MAX_VALUE;
        } // 변수 초기화

        while(!queue.isEmpty()) {
            int current = queue.poll();
            for (int i = 1; i <= N; i++) {
                if (current == i) continue;
                if (users[current][i] == 1) {
                    int tempDistance = distance[current] + 1;
                    if (distance[i] > tempDistance) {
                        distance[i] = tempDistance;
                        queue.add(i); // 거리 갱신
                    }
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (i == start) continue;
            answer += distance[i];
        }

        return answer;
    }
}

