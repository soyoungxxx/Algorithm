import java.util.*;
import java.io.*;

public class Main {
    private static List<Long> dp = new ArrayList<>();
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        // dp 초기화
        dp.add(0L);
        dp.add(1L);
        dp.add(1L);
        dp.add(1L);
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            if (dp.size() <= N) {
                getNumber(N);
            }
            System.out.println(dp.get(N));
        }
    }

    private static void getNumber(int N)  {
        if (dp.size() <= N - 1) getNumber(N-1);
        dp.add(dp.get(N-3) + dp.get(N-2));
    }
}