class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder(number);
        int index = 0;
        while (k > 0) {
            boolean isSmall = false;
            if (index == sb.length() - 1) {
                sb.deleteCharAt(index);
                break;
            }
            for (int i = index + 1; i <= index + k; i++) {
                if (sb.charAt(index) < sb.charAt(i)) {
                    isSmall = true;
                    break;
                }
            }
            if (isSmall) {
                sb.deleteCharAt(index);
                k--;
            }
            else index++;
        }
        String answer = sb.toString();
        return answer;
    }
}