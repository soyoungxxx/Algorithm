import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                flag = 1;
                answer.append(" ");
                continue;
            } 
            if (i == 0 || flag == 1) {
                if (c >= 'a' && c <= 'z') {
                    c = Character.toUpperCase(c);
                }
                flag = 0;
            }
            else {
                if (c >= 'A' && c <= 'Z') {
                    c = Character.toLowerCase(c);
                }
            }
            answer.append(Character.toString(c));
        }
        return answer.toString();
    }
}