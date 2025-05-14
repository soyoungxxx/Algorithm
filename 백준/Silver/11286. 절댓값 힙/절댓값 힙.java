import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 절대값 최소힙, 그냥값 최소힙 해서 해야되나
        PriorityQueue<Integer> minAbsHeap = new PriorityQueue<>(
                (a, b) -> {
                    if (Math.abs(a) == Math.abs(b)) {
                        return a - b;
                    }
                    return Math.abs(a) - Math.abs(b);
                }
        );

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) { // 연산 시작
            int x = Integer.parseInt(br.readLine());
            if (x != 0) {
                minAbsHeap.offer(x);
            }
            else {
                if (minAbsHeap.isEmpty()) System.out.println("0");
                else System.out.println(minAbsHeap.poll());
            }
        }
    }
}
