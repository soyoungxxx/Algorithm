import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        dp[0] = 0; dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            int min_num = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    min_num = 0;
                    break;
                }
                int num = i - (j*j);
                min_num = Math.min(min_num, dp[num]);
            }
            dp[i] = min_num + 1;
        }
        System.out.println(dp[N]);
    }
}