import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        long[] arr = new long[N];
        long[] sum = new long[N];

        long[] remains = new long[M];
        long result = 0;
        sum[0] = 0;

        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
            long remain = 0;
            if (i == 0) {
                sum[i] = arr[i];
            } else {
                sum[i] = sum[i-1] + arr[i];
            }
            remain = sum[i] % M;
            if (remain == 0) result += 1;
            result += remains[(int) remain];
            remains[(int) remain] += 1;
        }
        System.out.println(result);
    }
}