class Solution {
    public String solution(String my_string) {
        String answer = "";
        int len = my_string.length();
        for (int i = 0; i < len; i++) {
            char c = my_string.charAt(i);
            if (c >= 'a' && c <= 'z') { // 소문자
                c = (char) (c - 'a' + 'A');
            } else {
                c = (char) (c - 'A' + 'a');
            }
            answer += Character.toString(c);
        }
        return answer;
    }
}