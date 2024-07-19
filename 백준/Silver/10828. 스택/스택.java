import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        List<Character> brackets = Arrays.asList('(', ')', '{', '}', '[', ']');

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if ("pop".equals(str)) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());
                }

                continue;
            }
            else if ("size".equals(str)) {
                System.out.println(stack.size());

                continue;
            }
            else if ("empty".equals(str)) {
                if (stack.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }

                continue;
            }
            else if ("top".equals(str)) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peek());
                }

                continue;

            }

            String[] word = new String[2];
            if (str.contains(" ")) {
                word = str.split(" ");
            }
            stack.push(Integer.parseInt(word[1]));
        }
    }
}