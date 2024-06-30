class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int index = 0;
        long i = 0;
        while (index != n) {
            i += x;
            answer[index] = i;
            index += 1;
        }
        return answer;
    }
}
