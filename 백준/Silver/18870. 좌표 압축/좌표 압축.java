import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] sortArr = new int[N];
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
            sortArr[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(sortArr); // 오름차순 정렬
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (map.containsKey(sortArr[i])) continue;
            map.put(sortArr[i], index);
            index += 1;
        }
        for (int i = 0; i < N; i++) {
            arr[i] = map.get(arr[i]);
            if (i == 0) bw.write(Integer.toString(arr[i]));
            else bw.write(" " + arr[i]);
        }
        bw.flush();
        bw.close();
    }
}