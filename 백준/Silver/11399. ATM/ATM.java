import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);

        int sum = 0;
        int answer = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            answer += sum;
        }
        bw.write(Integer.toString(answer));
        bw.flush();
    }
}