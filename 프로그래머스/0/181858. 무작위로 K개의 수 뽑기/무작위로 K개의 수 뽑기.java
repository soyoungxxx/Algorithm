import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            if (set.size() == k) break;
        }
        List<Integer> answer = new ArrayList<>(set);
        int len = answer.size();
        if (answer.size() < k) {
            for (int i = 0; i < k - len; i++) {
                answer.add(-1);
            }
        }
        return answer;
    }
}