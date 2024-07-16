import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        List<Character> brackets = Arrays.asList('(', ')', '{', '}', '[', ']');

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        while (true) {
            String str = br.readLine();
            int len = str.length();
            stack.clear();

            if (str.equals(".")) break;

            for (int i = 0; i < len; i++) {
                char c = str.charAt(i);
                if (brackets.contains(c)) {
                    if (stack.isEmpty()) {
                        stack.push(c);
                    } else if (stack.peek() == '(' && c == ')') {
                        stack.pop();
                    } else if (stack.peek() == '{' && c == '}') {
                        stack.pop();
                    } else if (stack.peek() == '[' && c == ']') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            if (stack.isEmpty()) System.out.println("yes");
            else System.out.println("no");
        }

    }
}