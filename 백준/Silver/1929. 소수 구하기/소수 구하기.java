import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        boolean[] primeList = new boolean[N+1];
        for (int i = 2; i < N + 1; i++) {
            primeList[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (primeList[i]) {
                for (int j = i * i; j <= N; j+=i) {
                    primeList[j] = false;
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (primeList[i]) {
                System.out.println(i);
            }
        }

    }
}