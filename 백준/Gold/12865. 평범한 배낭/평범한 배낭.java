import java.io.*;

public class Main {
    static int N;
    static int K;
    static int[] weight;
    static int[] value;

    static int[][] maxValue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);

        weight = new int[N];
        value = new int[N];
        maxValue = new int[N+1][K+1];

        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            weight[i] = Integer.parseInt(input[0]);
            value[i] = Integer.parseInt(input[1]);
        }

        System.out.println(findMaxValue());
    }

    private static int findMaxValue() {
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                if (i == 0 || j == 0) {
                    maxValue[i][j] = 0;
                }
                else if (weight[i - 1] <= j) {
                    maxValue[i][j] = Math.max(value[i-1] + maxValue[i-1][j-weight[i-1]], maxValue[i-1][j]);
                }
                else {
                    maxValue[i][j] = maxValue[i-1][j];
                }
            }
        }
        return maxValue[N][K];
    }
}