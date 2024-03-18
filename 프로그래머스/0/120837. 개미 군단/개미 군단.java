class Solution {
    public int solution(int hp) {
        int answer = 0;
        while (true) {
            hp -= 5;
            if (hp < 0) {
                hp += 5;
                break;
            }
            answer += 1;
        }
        while (true) {
            hp -= 3;
            if (hp < 0) {
                hp += 3;
                break;
            }
            answer += 1;
        }
        answer += hp;
        return answer;
    }
}