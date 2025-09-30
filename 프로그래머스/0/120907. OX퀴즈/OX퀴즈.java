import java.util.*;

class Solution {
    public List<String> solution(String[] quiz) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            int sum = 0;
            boolean plus = true;
            for (int j = 0; j < split.length; j++) {
                try {
                    int num = Integer.parseInt(split[j]);
                    if (plus) sum += num;
                    else sum -= num;
                } catch (Exception e) {
                    if (split[j].equals("-")) plus = false;
                    else if (split[j].equals("+")) plus = true;
                    else break;
                }
            }
            int ans = Integer.parseInt(split[split.length - 1]);
            if (sum == ans) answer.add("O");
            else answer.add("X");
        }
        return answer;
    }
}