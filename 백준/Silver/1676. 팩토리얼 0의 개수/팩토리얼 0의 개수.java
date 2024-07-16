import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 5; i <= N; i+=5) {
            int copy = i;
            while (copy > 0) {
                if (copy % 5 != 0) break;
                copy /= 5;
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}