class Solution {
    public long solution(long n) {
        long answer = 0;
        if (Math.sqrt(n) % 1 == 0)  { // x가 정수인지 판단
            long sqrt = (long) Math.sqrt(n);
            answer = (long) Math.pow(sqrt+1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }
}