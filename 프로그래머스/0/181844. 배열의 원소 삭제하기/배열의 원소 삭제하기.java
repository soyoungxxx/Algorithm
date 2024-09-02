import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }
        for (int i = 0; i < delete_list.length; i++) {
            if (answer.contains(delete_list[i])) {
                answer.remove(answer.indexOf(delete_list[i]));
            }
        }
        return answer;
    }
}