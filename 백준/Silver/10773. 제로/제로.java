import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> list = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) list.pop();
            else list.push(num);
        }
        int sum = 0;
        while (!list.isEmpty()) sum += list.pop();
        System.out.println(sum);
    }
}