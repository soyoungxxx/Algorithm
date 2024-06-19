import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 표의 크기 N, 합을 구해야 하는 횟수 M
        int N = Integer.parseInt(br.readLine());
        int i = 1, j = 2, result = 1;
        int partSum = i + j;
        while(i < N) {
            if (partSum < N) {
                j += 1;
                partSum += j;
            } else if (partSum > N) {
                partSum -= i;
                i += 1;
            } else {
                result += 1;
                partSum -= i;
                i += 1; j += 1;
                partSum += j;
            }
        }
        System.out.println(result);
    }
}