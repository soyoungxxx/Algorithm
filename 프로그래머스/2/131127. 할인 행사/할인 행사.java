import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> list = new HashMap<>();
        List<Integer> index = new ArrayList<>();
        
        int wantLen = want.length;
        int discountLen = discount.length;
        
        for (int i = 0; i < wantLen; i++) {
            list.put(want[i], number[i]);
        }
        
        
        
        for (int i = 0; i < discountLen; i++) {
            if (list.get(discount[i]) != null) index.add(i);
        }
        int indexSize = index.size();
        
        for (int i = 0; i < indexSize; i++) {
            int count = 0;
            for (int j = index.get(i); j < discountLen; j++) {
                if (list.get(discount[j]) == null || list.get(discount[j]) <= 0) break;
                else {
                    if (list.get(discount[j]) > 0) {
                        list.put(discount[j], list.get(discount[j]) - 1);
                        count += 1;
                    }
                }
                if (count == 10) {
                    answer += 1;
                    break;
                }
            }
            for (int j = 0; j < wantLen; j++) {
                list.put(want[j], number[j]);
            }
        }
        return answer;
    }
}