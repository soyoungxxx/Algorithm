class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int num = left; num <= right; num++) {
            int cnt = 2;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) cnt++;
            }
            if (num == 1) cnt = 1;
            if (cnt % 2 == 0) answer += num;
            else answer -= num;
        }
        return answer;
    }
}