import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] str = my_string.toLowerCase().split("");
        Arrays.sort(str);
        for (String s : str) {
            answer.append(s);
        }
        return answer.toString();
    }
}