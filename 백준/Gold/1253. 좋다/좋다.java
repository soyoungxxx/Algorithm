import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        String[] number = br.readLine().split(" ");
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(number[i]);
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < N; i++) {
            int start = 0;
            int end = N - 1;
            long key = arr[i];
            while (start < N && end >= 0 && start != end) {
                if (arr[start] + arr[end] > key) {
                    end--;
                } else if (arr[start] + arr[end] < key) {
                    start++;
                } else {
                    if (start != i && end != i) {
                        count += 1;
                        break;
                    } else if (start == i) {
                        start++;
                    } else if (end == i) {
                        end--;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
