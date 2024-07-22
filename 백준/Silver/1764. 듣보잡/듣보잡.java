import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        Map<String, Integer> list = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            list.put(name, 1);
        }

        List<String> answer = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (list.get(name) != null) {
                answer.add(name);
            }
        }
        
        Collections.sort(answer);

        System.out.println(answer.size());
        for (String name : answer) {
            System.out.println(name);
        }
    }
}