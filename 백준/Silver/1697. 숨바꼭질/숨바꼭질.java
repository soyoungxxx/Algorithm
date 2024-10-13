import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int answer = 0;
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);
        boolean[] visited = new boolean[100001];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        visited[N] = true;
        boolean isDone = true;
        if (N == K) isDone = false;
        while (isDone) {
            int size = queue.size();
            answer += 1;

            for (int i = 0; i < size; i++) {
                int current = queue.poll();

                int minus = current - 1;
                int plus = current + 1;
                int multi = current * 2;

                if (minus == K || plus == K || multi == K) {
                    isDone = false;
                    break;
                }

                if (minus >= 0 && visited[minus] == false) {
                    queue.add(minus);
                    visited[minus] = true;
                }
                if (plus <= 100000 && visited[plus] == false) {
                    queue.add(plus);
                    visited[plus] = true;
                }
                if (multi <= 100000 && visited[multi] == false) {
                    queue.add(multi);
                    visited[multi] = true;
                }
            }
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}