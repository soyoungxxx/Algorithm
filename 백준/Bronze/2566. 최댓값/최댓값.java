import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[][] = new int[9][9];

        int maxNum = -1;
        int maxI = 0, maxJ = 0;

        for (int i = 0; i < 9; i++) {
            String[] str = sc.nextLine().split(" ");
            for (int j = 0; j < 9; j++) {
                number[i][j] = Integer.parseInt(str[j]);
                if (maxNum < number[i][j]) {
                    maxNum = number[i][j];
                    maxI = i + 1;
                    maxJ = j + 1;
                }
            }
        }
        System.out.println(maxNum);
        System.out.println(maxI + " " + maxJ);

    }
}
