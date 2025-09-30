class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        while (num > 0) {
            if (num % 10 == k) {
                answer = String.valueOf(num).length();
            }
            num /= 10;
        }
        return answer;
    }
}