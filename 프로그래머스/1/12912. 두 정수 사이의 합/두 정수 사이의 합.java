class Solution {
    public long solution(int a, int b) {
        if (a == b) return a;
        return ( (long) (a + b) * (Math.abs(a - b) + 1)) / 2;
    }
}