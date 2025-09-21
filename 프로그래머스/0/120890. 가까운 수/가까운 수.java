class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int new_diff = Math.abs(n - array[i]);
            if (new_diff < diff) {
                diff = new_diff;
                answer = array[i];
            }
            else if (new_diff == diff) {
                answer = Math.min(answer, array[i]);
            }
        }
        return answer;
    }
}