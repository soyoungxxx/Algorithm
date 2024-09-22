import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        String game = inputs[1];

        // 인원 수 결정
        int p = 3;
        if (game.equals("Y")) p = 1;
        else if (game.equals("F")) p = 2;

        HashMap<String, Integer> players = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            players.put(name, 1);
        }
        System.out.println(players.size() / p);
    }
}