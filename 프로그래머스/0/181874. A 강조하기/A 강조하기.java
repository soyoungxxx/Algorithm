class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            String str = Character.toString(myString.charAt(i));
            if ("a".equals(str)) {
                answer += str.toUpperCase();
            }
            else if ("A".equals(str)) {
                answer += str;
            } else {
                answer += str.toLowerCase();
            }
        }
        return answer;
    }
}