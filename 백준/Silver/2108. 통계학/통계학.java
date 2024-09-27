import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N은 홀수
        int num[] = new int[N];
        Map<Integer, Integer> map = new LinkedHashMap<>();

        double avg = 0;
        int mode = 0;

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            num[i] = number;
            avg += (double) number;
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                list.add(key);
            }
        }

        Collections.sort(list);

        if (list.size() > 1) {
            mode = list.get(1);
        } else {
            mode = list.get(0);
        }


        Arrays.sort(num);
        int mid = num[N/2];
        int range = num[N-1] - num[0];
        avg /= N;

        System.out.println((int) Math.round(avg));
        System.out.println(mid);
        System.out.println(mode);
        System.out.println(range);
    }
}