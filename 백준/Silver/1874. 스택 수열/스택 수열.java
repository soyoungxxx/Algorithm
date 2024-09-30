import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int num = 1, index = 0;
        while (num < N + 2 && index < N) {
            if (!stack.isEmpty() && stack.peek() == arr[index]) {
                list.add("-");
                stack.pop();
                index += 1;
            }
            else if (stack.isEmpty() || stack.peek() != arr[index]) {
                list.add("+");
                stack.add(num);
                num += 1;
            }
        }

        if (stack.isEmpty()) {
            for (String op : list) {
                System.out.println(op);
            }
        } else {
            System.out.println("NO");
        }
    }
}