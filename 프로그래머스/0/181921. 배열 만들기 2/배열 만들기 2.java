import java.util.*;

class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String str = Integer.toString(i);
            str = str.replace("5", ""); // 5 제거
            str = str.replace("0", ""); // 0 제거
            if (str.length() == 0) answer.add(i);
        }
        if (answer.size() == 0) answer.add(-1);
        return answer;
    }
}