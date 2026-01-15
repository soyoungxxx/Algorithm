class Solution {
    public int solution(int n) {
        int answer = n;
        for (int i = 1; i <= answer; i++) {
            if (i % 3 == 0) answer++;
            else {
                int cpy = i;
                while (cpy > 0) {
                    if (cpy % 10 == 3) {
                        answer++;
                        break;
                    }
                    else cpy /= 10;
                }
            }
            
        }
        return answer;
    }
}