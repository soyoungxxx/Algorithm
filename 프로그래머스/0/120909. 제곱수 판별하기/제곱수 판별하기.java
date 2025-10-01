class Solution {
    public int solution(int n) {
        int answer = 2;
        double num = Math.sqrt(n);
        if (num == (int) num) answer = 1;
        return answer;
    }
}