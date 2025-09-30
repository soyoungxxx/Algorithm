class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int pat_len = pat.length();
        for (int i = 0; i + pat_len - 1 < myString.length(); i++) {
            int current_idx = i;
            int last_idx = i + pat_len;
            if (myString.substring(current_idx, last_idx).equals(pat)) answer++;
        }
        return answer;
    }
}