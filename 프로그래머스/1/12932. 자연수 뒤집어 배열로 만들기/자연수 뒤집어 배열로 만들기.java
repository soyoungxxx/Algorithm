import java.util.*;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> answerList = new ArrayList<>();
        while (n > 0) {
            answerList.add((int) (n % 10));
            n /= 10;
        }
        int[] answer = answerList.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
        return answer;
    }
}