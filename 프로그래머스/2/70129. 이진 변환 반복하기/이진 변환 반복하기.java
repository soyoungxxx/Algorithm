class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while (!s.equals("1")) {
            // 0 제거
            answer[1] += s.length() - s.replace("0", "").length();
            s = s.replace("0", "");
            
            // 이진 변환
            answer[0] += 1;
            s = (Long.toString(s.length(), 2));
        }
        return answer;
    }
}