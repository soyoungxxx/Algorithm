class Solution {
    public int solution(String num_str) {
        int answer = 0;
        boolean flag = true;
        for (int i = 0; i < num_str.length(); i++) {
            char c = num_str.charAt(i);
            if (c >= '0' && c <= '9') {
                if (flag) answer += c - '0';
                else answer -= c - '0';
                flag = true;
            }
            else {
                flag = false;
            }
        }
        return answer;
    }
}