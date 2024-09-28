import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int K = Integer.parseInt(inputs[0]);
        int N = Integer.parseInt(inputs[1]);
        int[] lines = new int[K];
        for (int i = 0; i < K; i++) {
            lines[i] = Integer.parseInt(br.readLine());
        }
        Long min = 1L;
        Long max = Long.valueOf(Arrays.stream(lines).max().getAsInt());
        Long middle = 0L;
        while (true) {
            middle = (min + max) / 2;
            int count = 0;
            for (int i = 0; i < K; i++) {
                count += lines[i] / middle;
            }
            if (min > max) break;
            else if (count >= N) min = middle + 1;
            else max = middle - 1;
        }
        System.out.println(middle);
    }
}