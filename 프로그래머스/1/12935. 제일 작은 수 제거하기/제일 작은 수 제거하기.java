import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        if (arr.length == 1) {
            answer.add(-1);
            return answer;
        }
        
        int min = arr[0], minIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (i == minIdx) continue;
            answer.add(arr[i]);
        }
        
        return answer;
    }
}