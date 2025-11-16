class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        return 2 * Math.min(a, b) - 1;
    }
}