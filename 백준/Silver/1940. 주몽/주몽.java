import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 표의 크기 N, 합을 구해야 하는 횟수 M
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        int result = 0;
        int i = 0, j = list.size() - 1;
        while (i < j) {
            int start = list.get(i);
            int end = list.get(j);
            int sum = start + end;
            if (sum < M) {
                i += 1;
            } else if (sum > M) {
                j -= 1;
            } else {
                result += 1;
                i += 1; j -= 1;
            }
        }
        System.out.println(result);
    }
}