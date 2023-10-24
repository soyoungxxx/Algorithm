import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            cnt = 0;
            int n = Integer.parseInt(br.readLine());
            makeSum(0, n);
            System.out.println(cnt);
        }
    }

    private static void makeSum(int a, int sum) {
        if (a == sum) {
            cnt += 1;
            return;
        }

        if (a > sum) {
            return;
        }

        makeSum(a + 1, sum);
        makeSum(a + 2, sum);
        makeSum(a + 3, sum);
    }
}
