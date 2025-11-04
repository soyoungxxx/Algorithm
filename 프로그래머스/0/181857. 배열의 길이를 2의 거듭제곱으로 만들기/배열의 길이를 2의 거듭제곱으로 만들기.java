import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }
        int len = 1;
        int newLen = 0;
        while(arr.length > len) {
            len *= 2;
        }
        if (arr.length == len) return answer;
        while (answer.size() < len) {
            answer.add(0);
        }
        return answer;
    }
}