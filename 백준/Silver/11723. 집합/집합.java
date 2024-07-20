import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Integer> set = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if ("all".equals(input)) {
                set.clear();
                for (int num = 1; num <= 20; num++) {
                    set.add(num);
                }
                continue;
            } else if ("empty".equals(input)) {
                set.clear();
                continue;
            }
            String[] opers = input.split(" ");
            String operation = opers[0];
            int num = Integer.parseInt(opers[1]);
            if ("add".equals(operation)) {
                if (set.contains(num)) continue;
                set.add(num);
            } else if ("remove".equals(operation)) {
                if (!set.contains(num)) continue;
                set.remove(num);
            } else if ("check".equals(operation)) {
                if (set.contains(num)) bw.write(1 + "\n");
                else bw.write(0 + "\n");
            } else if ("toggle".equals(operation)) {
                if (set.contains(num)) set.remove(num);
                else set.add(num);
            }
        }
        bw.flush();
    }
}