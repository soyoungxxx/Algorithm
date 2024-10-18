class Solution {
    public int[] solution(int[] array) {
        int max = array[0], maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        int[] answer = {max, maxIndex};
        return answer;
    }
}