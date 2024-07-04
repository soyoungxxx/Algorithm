class Solution {
    public long solution(int n) {
        long answer = 0;
        long num = Long.parseLong(Long.toString(n, 3));
        long reverseNum = 0;
        while (num > 0) {
            reverseNum *= 10;
            reverseNum += num % 10;
            num /= 10;
        }
        answer = Long.parseLong(Long.toString(reverseNum), 3);
        
        return answer;
    }
}