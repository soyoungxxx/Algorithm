import java.util.*;
import java.io.*;

public class Main {
    static Map<Integer, int[]> cnt = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            System.out.println(cnt.get(N)[0] + " " + cnt.get(N)[1]);
        }
    }

    private static int[] fibonacci(int N) {
        if (cnt.containsKey(N)) {
            return cnt.get(N);
        }

        if (N == 1) {
            cnt.put(1, new int[] {0, 1});
            return new int[] {0, 1};
        } else if (N == 0) {
            cnt.put(0, new int[] {1, 0});
            return new int[] {1, 0};
        }

        int[] arr1 = fibonacci(N-1);
        int[] arr2 = fibonacci(N-2);
        cnt.put(N, new int[]{arr1[0]+arr2[0],arr1[1]+arr2[1]});
        return cnt.get(N);
    }
}