import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N, K;
        int answer = 0;
        String inputs[] = br.readLine().split(" ");
        N = Integer.parseInt(inputs[0]);
        K = Integer.parseInt(inputs[1]);
        int coins[] = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            int coin = Integer.parseInt(br.readLine());
            coins[i] = coin;
        }

        for (int i = 0; i < N; i++) {
            if (coins[i] <= K) {
                int count = K / coins[i];
                answer += count;
                K -= count * coins[i];
            }
        }

        System.out.println(answer);
    }
}