import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int B = Integer.parseInt(inputs[2]);
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            inputs = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(inputs[j]);
            }
        } // 입력
        int minTime = Integer.MAX_VALUE;
        int height = Integer.MAX_VALUE;
        for (int i = 0; i <= 256; i++) {
            int put = 0;
            int get = 0;
            // 배열 순회 시작
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    int num = arr[j][k];
                    if (num < i) {
                        put += i - num;
                    } else {
                        get += num -i;
                    }
                }
            }
            if (put > B + get) continue;
            int time = put + (get * 2);
            if (time < minTime) {
                minTime = time;
                height = i;
            } else if (time == minTime) {
                height = Math.max(height, i);
            }
        }
        System.out.println(minTime + " " + height);
        System.out.println();
    }
}
