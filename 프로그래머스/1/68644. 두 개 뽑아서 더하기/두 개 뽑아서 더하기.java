import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int num = numbers[i] + numbers[j];
                if (answer.contains(num)) continue;
                else answer.add(numbers[i] + numbers[j]);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}