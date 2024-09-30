import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        Map<String, String> pokemon = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String num = Integer.toString(i);
            String name = br.readLine();
            pokemon.put(num, name);
            pokemon.put(name, num);
        }
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            bw.write(pokemon.get(str) + "\n");
        }
        bw.flush();
    }
}