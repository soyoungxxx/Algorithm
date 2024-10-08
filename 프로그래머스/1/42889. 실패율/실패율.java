import java.util.*;

class Solution {
    public List<Integer> solution(int N, int[] stages) {
        Map<Integer, Double> fail = new HashMap<>();
        Arrays.sort(stages);
        int mem = stages.length; //  사용자 수
        int cnt = 0, index = 0, sum = 0;
        for (int i = 1; i <= N; i++) {
            if (index >= mem) {
                fail.put(i, 0.0);
                continue;
            }
            if (i < stages[index]) {
                fail.put(i, 0.0);
                continue;
            }
            while (i == stages[index]) {
                cnt += 1;
                index += 1;
                if (index >= mem) break;
            }
            double num = (double) cnt / (mem - sum);
            if (Double.isNaN(num)) fail.put(i, 0.0);
            else fail.put(i, num);
            sum += cnt;
            cnt = 0;
        }
        List<Integer> keySet = new ArrayList<>(fail.keySet());

        // Value 값으로 오름차순 정렬
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int num = -fail.get(o1).compareTo(fail.get(o2));
                if (num == 0) {
                    return o1 - o2;       
                }
                return num;
            }
        });
        
        return keySet;
    }
}