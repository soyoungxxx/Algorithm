class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        for (int i = k, index = 0; i <= n; i += k, index++) {
            answer[index] = i;
        }
        return answer;
    }
}