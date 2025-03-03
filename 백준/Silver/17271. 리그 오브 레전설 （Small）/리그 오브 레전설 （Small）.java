import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]); // 싸움 시간
        int M = Integer.parseInt(inputs[1]); // B 스킬 시전 시간
        int[] dp = new int[N + 1];
        int count = 0;
        // 입력

        // 1000000007 로 mod
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            if (i < M) dp[i] = 1;
            else if (i == M) dp[i] = 2;
            else dp[i] = (dp[i-1] + dp[i-M]) % 1000000007;
        }

        System.out.println(dp[N]);
    }
}
