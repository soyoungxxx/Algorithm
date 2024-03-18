class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int dice[] = new int[7];
        
        // 초기값 설정
        dice[a] += 1;
        dice[b] += 1;
        dice[c] += 1;
        dice[d] += 1;
        
        int p = 0, q = 0;
        int second[] = {0, 0};
        int one[] = {0, 0, 0, 0};
        int s = 0, o = 0;
        for (int i = 1; i < dice.length; i++) {
            if (dice[i] == 4) {
                answer = 1111 * i;
            }
            else if (dice[i] == 3) {
                p = i;
            }
            else if (dice[i] == 2) {
                second[s] = i;
                s += 1;
            }
            else if (dice[i] == 1) {
                one[o] = i;
                o += 1;
            }
        }
        
        if (answer != 0) return answer;
        
        if (p != 0) {
            answer = (int) Math.pow((10 * p + one[0]), 2);
        }
        
        else if (second[0] != 0 && second[1] != 0) {
            answer = (second[0] + second[1]) * Math.abs(second[0] - second[1]);
        }
        
        else if (second[0] != 0 && second[1] == 0) {
            answer = one[0] * one[1];
        }
        
        else answer = one[0];
        
        return answer;
    }
}