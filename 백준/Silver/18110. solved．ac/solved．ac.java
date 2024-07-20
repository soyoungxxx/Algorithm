import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 의견의 개수
        if (n == 0) System.out.println("0");
        else {
            int[] rate = new int[n];
            for (int i = 0; i < n; i++) {
                rate[i] = Integer.parseInt(br.readLine());
            }
            int number = (int) Math.round(n * 0.15); // 제외할 의견 수
            Arrays.sort(rate); // rate 정렬
            int sum = 0, count = 0; // 합계, 개수 셀 카운트
            for (int i = number; i < n - number; i++) {
                sum += rate[i];
                count += 1;
            }
            System.out.println((int) Math.round((double) sum / count));
        }
    }
}