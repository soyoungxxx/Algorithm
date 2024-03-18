import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            int flag = 1;
            int num = i;
            while (num > 0) {
                if (num % 10 == 5 || num % 10 == 0) {
                    num /= 10;
                }
                else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                list.add(i);
            }
        }
        if (list.size() == 0) list.add(-1);
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}