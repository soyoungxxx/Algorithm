class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= '0' && c <= '9') {
                sum = (sum * 10) + (c - '0');
            }
            else {
                answer += sum;
                sum = 0;
            }
        }
        if (sum != 0) answer += sum;
        return answer;
    }
}