import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (flag == 0 && arr[i] == 2) {
                list.add(arr[i]);
                flag = 1;
            }
            else if (flag == 1 && arr[i] == 2) {
                list.addAll(tmp);
                list.add(arr[i]);
                tmp.clear();
            }
            else if (flag == 1) {
                tmp.add(arr[i]);
            }
        }
        if (flag == 0) {
            list.add(-1);
        }
        answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        
        return answer;
    }
}