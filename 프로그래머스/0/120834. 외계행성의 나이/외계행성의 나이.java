class Solution {
    public String solution(int age) {
        String str = "", answer = "";
        while (age > 0) {
            int num = age % 10;
            str += (char) (num + 'a');
            age /= 10;
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            answer += str.charAt(i);
        }
        return answer;
    }
}