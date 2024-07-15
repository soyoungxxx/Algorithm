import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 상근이가 가진 숫자 카드의 개수
        String[] input = br.readLine().split(" ");
        Map<Integer, Integer> cards = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int cardsNumber = Integer.parseInt(input[i]);
            if (cards.get(cardsNumber) != null) {
                int value = cards.get(cardsNumber);
                cards.put(cardsNumber, value += 1);
            } else {
                cards.put(cardsNumber, 1);
            }
        } // 카드 개수와 값 Map에 저장

        int M = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");
        int[] count = new int[M];
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(input[i]);
            if (cards.get(num) == null) {
                count[i] = 0;
            } else {
                count[i] = cards.get(num);
            }
        }

        for (int i = 0; i < M; i++) {
            System.out.print(count[i] + " ");
        }
    }
}