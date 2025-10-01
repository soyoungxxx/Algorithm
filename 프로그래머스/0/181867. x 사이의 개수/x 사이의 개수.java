import java.util.*;

class Solution {
    public List<Integer> solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < myString.length(); i++) {
            String str = Character.toString(myString.charAt(i));
            if (str.equals("x")) {
                answer.add(sum);
                sum = 0;
            } else sum += 1;
        }
        answer.add(sum);
        return answer;
    }
}