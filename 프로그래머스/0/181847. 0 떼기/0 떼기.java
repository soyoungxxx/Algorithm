class Solution {
    public String solution(String n_str) {
        String answer = "";
        for (int i = 0; i < n_str.length(); i++) {
            char c = n_str.charAt(i);
            if (c == '0') continue;
            else {
                answer = n_str.substring(i, n_str.length());
                break;
            }
        }
        return answer;
    }
}