class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer[] = new String[queries.length + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = "";
        }
        answer[0] += my_string;
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            for (int j = 0; j < s; j++) {
                answer[i+1] += answer[i].charAt(j);
            }
            for (int j = e; j >= s; j--) {
                answer[i+1] += answer[i].charAt(j);
            }
            for (int j = e + 1; j < my_string.length(); j++) {
                answer[i+1] += answer[i].charAt(j);
            }
        }
        return answer[answer.length-1];
    }
}