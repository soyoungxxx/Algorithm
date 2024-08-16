import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        Map<String, String> accounts = new HashMap<>();
        // key = 사이트 이름, value = 비밀번호
        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            accounts.put(input[0], input[1]);
        }
        for (int i = 0; i < M; i++) {
            bw.write(accounts.get(br.readLine()) + "\n");
        }
        bw.flush();
    }
}