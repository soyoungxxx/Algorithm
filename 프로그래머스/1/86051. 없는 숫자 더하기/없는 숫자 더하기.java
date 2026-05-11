import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int i = 0, index = 0;
        while (i <= 9 && index < numbers.length) {
            if (numbers[index] == i) {
                index++;
                i++;
            }
            else {
                answer += i;
                i++;
            }
        }
        
        if (i != 0) {
            for (; i <= 9; i++) {
                answer += i;
            }
        }
        
        return answer;
    }
}