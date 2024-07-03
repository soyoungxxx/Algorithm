class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        int index = 0;
        for (int i = 0; i < len; i++) {
            String alph = Character.toString(s.charAt(i));
            if (alph.equals(" ")) {
                answer += alph;
                index = 0;
                continue;
            }
            
            if(index % 2 == 0) {
                answer += alph.toUpperCase();
            } else {
                answer += alph.toLowerCase();
            }
            index += 1;
        }
        return answer;
    }
}