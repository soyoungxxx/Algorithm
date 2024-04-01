import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(arr)
                                .boxed()
                                .collect(Collectors.toList());
        
        for (int i = 0; i < query.length; i++) {
            int index = query[i];
            int len = list.size();
            if (i % 2 == 0) {
                for (int j = len - 1; j > index; j--) {
                    list.remove(j);
                }
            }
            else {
                for (int j = index - 1; j >= 0; j--) {
                    list.remove(j);
                }
            }
        }
        answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}