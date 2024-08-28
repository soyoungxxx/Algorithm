import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<int[]> queue = new LinkedList<>();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input[] = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]); // 문서의 개수
            int M = Integer.parseInt(input[1]); // 찾으려는 문서가 현재 큐에 몇 번째에 있는지
            input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                queue.add(new int[]{j, Integer.parseInt(input[j])}); // 순서, 중요도 순으로 저장
            }
            int cnt = 0;
            while (!queue.isEmpty()) {
                int front = queue.peek()[1]; // 첫 값
                int current = queue.peek()[0]; // 현재 인덱스
                Iterator<int[]> iter = queue.iterator();
                while (iter.hasNext()) {
                    int value = iter.next()[1];
                    if (front < value) {
                        queue.add(queue.poll());
                        break;
                    }
                }
                if (current == queue.peek()[0]) {
                    queue.poll();
                    cnt += 1;
                    if (current == M) {
                        bw.write(cnt + "\n");
                        break;
                    }
                }
            }
            queue.clear();
        }
        bw.flush();
    }
}