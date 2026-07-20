class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);
        int bigCount = -1;
        while (count != bigCount) {
            n++;
            bigCount = Integer.bitCount(n);
        }
        answer = n;
        return answer;
    }
}