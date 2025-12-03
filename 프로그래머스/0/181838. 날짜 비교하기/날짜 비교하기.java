class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int date1ToNum = date1[0] * 10000 + date1[1] * 100 + date1[2];
        int date2ToNum = date2[0] * 10000 + date2[1] * 100 + date2[2];
        return date1ToNum < date2ToNum ? 1 : 0;
    }
}