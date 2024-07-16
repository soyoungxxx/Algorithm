import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        int count_shirts = 0;
        int[] count_pens = new int[2];
        // count_pens[0] -> 묶음으로 몇 개를 사야하는지
        // count_pens[1] -> 한 자루씩 몇 개 주문하는지

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int len = input.length;
        int[] size = new int[len];
        for (int i = 0; i < len; i++) {
            size[i] = Integer.parseInt(input[i]);
        }
        input = br.readLine().split(" ");
        int T = Integer.parseInt(input[0]);
        int P = Integer.parseInt(input[1]);
        for (int i = 0; i < len; i++) {
            // 각 티셔츠를 몇 묶음씩 사야하는지 결정하기 (size[i])
            count_shirts += size[i] / T;
            if (size[i] % T != 0) count_shirts += 1;
        }
        count_pens[0] = N / P;
        count_pens[1] = N % P;

        System.out.println(count_shirts);
        System.out.println(count_pens[0] + " " + count_pens[1]);
    }
}