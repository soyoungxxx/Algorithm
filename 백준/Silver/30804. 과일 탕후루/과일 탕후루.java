import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] fruits = new int[N];
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(inputs[i]);
        }
        int start = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        for (int end = 0; end < N; end++) {
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);
            while (map.size() > 2) {
                int num = map.get(fruits[start]);
                if (num - 1 == 0) {
                    map.remove(fruits[start]);
                } else {
                    map.put(fruits[start], num - 1);
                }
                start += 1;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        System.out.println(maxLength);
    }
}
