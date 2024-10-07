import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(inputs[0]);
            arr[i][1] = Integer.parseInt(inputs[1]);
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}