class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum, num);
        }
        String answer = Integer.toString(minNum) + " " + Integer.toString(maxNum);
        return answer;
    }
}