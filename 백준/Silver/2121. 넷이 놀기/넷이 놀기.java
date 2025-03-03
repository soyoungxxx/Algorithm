import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int[][] points = new int[N][2];
        Set<String> set = new HashSet<>();
        Map<int[], Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            inputs = input.split(" ");
            int y = Integer.parseInt(inputs[0]);
            int x = Integer.parseInt(inputs[1]);
            points[i][0] = y;
            points[i][1] = x;
            set.add(input);
        } // 입력
        // 직사각형 찾기
        int answer = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            int y = points[i][0], x = points[i][1];
            String str1 = (y + A) + " " + x;
            String str2 = y + " " + (x + B);
            String str3 = (y + A) + " " + (x + B);
            if (set.contains(str1)) count += 1;
            if (set.contains(str2)) count += 1;
            if (set.contains(str3)) count += 1;

            if (count == 3) answer += 1;
        }
        System.out.println(answer);
    }
}

/*
1 0 0 1 0 0
0 0 0 0 0 0
1 0 0 1 0 0
0 0 0 0 0 0
1 0 0 1 0 0
 */