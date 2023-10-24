import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static char[][] candyColor;
    private static int cnt = 0;
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        candyColor = new char[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            candyColor[i] = str.toCharArray();
        }
        changeCandy();
        System.out.println(cnt);
    }

    private static void changeCandy() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (candyColor[i][j] != candyColor[i][j+1]) {
                    swapRow(i, j);
                    getMaxCandy();
                    swapRow(i, j);
                }

                if (candyColor[j][i] != candyColor[j+1][i]) {
                    swapColumn(j, i);
                    getMaxCandy();
                    swapColumn(j, i);
                }
            }
        }
    }

    private static void swapColumn(int i, int j) {
        char tmp = candyColor[i][j];
        candyColor[i][j] = candyColor[i+1][j];
        candyColor[i+1][j] = tmp;
    }

    private static void swapRow(int i, int j) {
        char tmp = candyColor[i][j];
        candyColor[i][j] = candyColor[i][j+1];
        candyColor[i][j+1] = tmp;
    }

    private static int getRowCandy() {
        int row = 0;
        int maxRow = 0;
        char color;

        for (int i = 0; i < N; i++) {
            color = candyColor[i][0];
            row = 0;
            for (int j = 0; j < N; j++) {
                if (color == candyColor[i][j]) {
                    row += 1;
                    continue;
                } else {
                    color = candyColor[i][j];
                    maxRow = Math.max(maxRow, row);
                    row = 1;
                }
            }
            maxRow = Math.max(maxRow, row);
        }

        return maxRow;
    }

    private static int getColCandy() {
        int col = 0;
        int maxCol = 0;
        char color;

        for (int i = 0; i < N; i++) {
            col = 0;
            color = candyColor[0][i];
            for (int j = 0; j < N; j++) {
                if (color == candyColor[j][i]) {
                    col += 1;
                } else {
                    color = candyColor[j][i];
                    maxCol = Math.max(maxCol, col);
                    col = 1;
                }
            }
            maxCol = Math.max(maxCol, col);
        }

        return maxCol;
    }

    private static void getMaxCandy() {
        int row = getRowCandy();
        int col = getColCandy();

        int max = Math.max(row, col);
        cnt = Math.max(max, cnt);
    }

    private static void print() {
        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++) {
                System.out.print(candyColor[i][j]);
            }
            System.out.println();
        }
        System.out.println("----");
    }
}

/*
1. 열에서 교환하는 메소드
2. 행에서 교환하는 메소드
3. 제일 길게 연결된 부분의 수를 반환하는 메소드
 */