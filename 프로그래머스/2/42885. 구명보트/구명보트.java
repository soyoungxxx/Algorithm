import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int start = 0, end = people.length - 1;
        Arrays.sort(people);
        while (start <= end) {
            if (people[start] + people[end] <= limit) {
                answer += 1;
                start++;
                end--;
            }
            else {
                answer += 1;
                end--;
            }
        }
        Arrays.sort(people);
        return answer;
    }
}