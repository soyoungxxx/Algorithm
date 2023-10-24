import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");

            int M = Integer.parseInt(str[0]);
            int N = Integer.parseInt(str[1]);
            int x = Integer.parseInt(str[2]);
            int y = Integer.parseInt(str[3]);

            int cnt = findYear(M, N, x, y);
            System.out.println(cnt);
        }
    }

    private static int findYear(int M, int N, int x, int y) {
        int k = M * N;
        while (x <= k || y <= k) {
            if (x < y) {
                x += M;
            }
            else if (y < x) {
                y += N;
            }
            else {
                return x;
            }
        }

        return -1;
    }
}