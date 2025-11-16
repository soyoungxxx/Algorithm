class Solution {
    public int solution(String my_string, String target) {
        boolean result = my_string.contains(target);
        int answer = result ? 1 : 0;
        return answer;
    }
}