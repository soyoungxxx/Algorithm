class Solution {
    public int solution(int n) {
        int answer = 1;
        if (n == 1) return answer;
        
        int start = 1, end = 2;
        int sum = start + end;
        
        while(start < end) {
            if (sum < n) {
                end++;
                sum += end;
            }
            else if (sum == n) {
                answer += 1;
                sum -= start;
                start++;
            } 
            else if (sum > n) {
                sum -= start;
                start++;
            }
        }
        return answer;
    }
}