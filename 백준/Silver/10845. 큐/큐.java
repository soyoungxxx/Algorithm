import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        List<Character> brackets = Arrays.asList('(', ')', '{', '}', '[', ']');

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        int back = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if ("pop".equals(str)) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.poll());
                }

                continue;
            }
            else if ("size".equals(str)) {
                System.out.println(queue.size());

                continue;
            }
            else if ("empty".equals(str)) {
                if (queue.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }

                continue;
            }
            else if ("front".equals(str)) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.peek());
                }
                continue;
            }
            else if ("back".equals(str)) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(back);
                }
                continue;
            }

            String[] word = new String[2];
            if (str.contains(" ")) {
                word = str.split(" ");
            }
            queue.add(Integer.parseInt(word[1]));
            back = Integer.parseInt(word[1]);
        }
    }
}