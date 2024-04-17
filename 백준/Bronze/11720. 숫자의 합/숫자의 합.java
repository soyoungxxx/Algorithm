import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int sum = 0;
        String[] str = sc.nextLine().split("");

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}
