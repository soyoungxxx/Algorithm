class Solution {
    public String solution(String s) {
        String answer = "";
        int len = 0;
        if (s.length() % 2 == 0) {
            len = s.length() / 2 - 1;
        } else {
            len = s.length() / 2;
        }
        answer = s.substring(len, s.length() - len);
        return answer;
    }
}