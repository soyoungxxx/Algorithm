import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());
        int maxScore = 0;
        double avg = 0;
        
        String tmp[] = new String[N];
        int score[] = new int[N];
        
        tmp = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(tmp[i]);
            maxScore = Math.max(maxScore, score[i]);
        }
        for (int i = 0; i < N; i++) {
            avg += (double) score[i] / maxScore * 100;
        }
        System.out.println(avg/N);
    }
}
