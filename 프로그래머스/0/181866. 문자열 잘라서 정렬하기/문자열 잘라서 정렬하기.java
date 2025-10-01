import java.util.*;
class Solution {
    public List<String> solution(String myString) {
        String[] str = myString.split("x");
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals("")) continue;
            answer.add(str[i]);
        }
        Collections.sort(answer);
        return answer;
    }
}