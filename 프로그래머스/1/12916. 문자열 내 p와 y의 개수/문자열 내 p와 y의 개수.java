class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int p = 0, y = 0;

        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                p += 1;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                y += 1;
            }
        }
        if (p != y) answer = false;
        
        return answer;
    }
}