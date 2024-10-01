import java.util.*;
import java.io.*;

public class Main {
    private static int[][] arr;
    private static int[] answer = new int[2];

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputs[] = br.readLine().split(" ");
         int N = Integer.parseInt(inputs[0]);
        Long M = Long.parseLong(inputs[1]);
        Long[] trees = new Long[N];
        inputs = br.readLine().split(" ");
        Long start = 0L, end = 0L, mid = 0L;
        for (int i = 0; i < N; i++) {
            trees[i] = Long.parseLong(inputs[i]);
            end = Math.max(end, trees[i]);
        } // 입력 끝
        while (start < end) {
            mid = (start + end) / 2;
            Long answer = 0L;
            for (int i = 0; i < N; i++) {
                if (trees[i] > mid) answer += trees[i] - mid;
                if (answer >= M) break;
            }
            if (answer >= M) start = mid + 1;
            else end = mid;
        }
        System.out.println(start - 1);
    }
}