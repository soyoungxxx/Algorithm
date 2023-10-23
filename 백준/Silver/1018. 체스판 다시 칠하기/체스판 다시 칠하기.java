import java.io.*;
import java.util.*;

public class Main {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                }
                else arr[i][j] = false;
            }
        }

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                findMinCount(i, j);
            }
        }

        System.out.println(min);
    }

    static void findMinCount(int x, int y) {
        int x_limit = x + 8;
        int y_limit = y + 8;
        int cnt = 0;

        boolean auth = arr[x][y];

        for (int i = x; i < x_limit; i++) {
            for (int j = y; j < y_limit; j++) {
                if (arr[i][j] != auth) {
                    cnt += 1;
                }

                auth = (!auth);
            }
            auth = (!auth);
        }

        cnt = Math.min(cnt, 64-cnt);
        min = Math.min(min, cnt);
    }
}