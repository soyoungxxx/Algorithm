import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) map.put(rank[i], i);
        }
        List<Integer> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        int index = 0;
        int[] numList = new int[3];
        for (Integer key: keyList) {
            if (index >= 3) break;
            numList[index++] = map.get(key);
        }
        answer = (numList[0] * 10000) + (numList[1] * 100) + numList[2];
        return answer;
    }
}