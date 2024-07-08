import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            String rotate = s.substring(i) + s.substring(0, i);
            if (checkRight(rotate, len)) answer += 1;
        }
        return answer;
    }
    
    private boolean checkRight(String s, int len) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            String str = Character.toString(s.charAt(i));
            if (stack.isEmpty()) {
                stack.push(str);
            } else {
                String peek = stack.peek();
                if (peek.equals("[") && str.equals("]")) {
                    stack.pop();
                }
                else if (peek.equals("(") && str.equals(")")) {
                    stack.pop();
                }
                else if (peek.equals("{") && str.equals("}")) {
                    stack.pop();
                }
                else {
                    stack.push(str);
                }
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}