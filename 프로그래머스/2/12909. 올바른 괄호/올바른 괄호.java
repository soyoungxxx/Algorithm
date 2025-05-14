import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        boolean flag = true;
        
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') stack.push(Character.toString(c));
            else if (c == ')') {
                if (stack.size() == 0) {
                    flag = false;
                    break;
                }
                stack.pop();
            }
        }
        if (stack.size() == 0 && flag) answer = true;

        return answer;
    }
}