import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 수의 개수 N, 합을 구해야 하는 횟수 M
        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arr = new int[N];
        int[] sum = new int[N+1];
        sum[0] = 0;
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
            sum[i+1] = sum[i] + arr[i];
        }

        // a, b => 합을 구해야 하는 구간. 즉, a ~ b까지의 합을 구해야함
        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]) - 1;
            int b = Integer.parseInt(input[1]);
            System.out.println(sum[b] - sum[a]);
        }
    }
}