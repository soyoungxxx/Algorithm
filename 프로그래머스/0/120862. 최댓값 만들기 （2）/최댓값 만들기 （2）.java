import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        int len = numbers.length;
        int maxs = numbers[len - 1] * numbers[len - 2];
        int mins = numbers[0] * numbers[1];
        answer = maxs > mins ? maxs : mins;
        return answer;
    }
}