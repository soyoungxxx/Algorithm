import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int len = friends.length;
        
        Map<String, Integer> person = new HashMap<>(); // 사람 - 번호 매치
        int[][] count = new int[len][len]; // 주고 받은 선물 체크
        int[][] point = new int[len][3]; // 선물 지수 계산
        
        for (int i = 0; i < len; i++) {
            person.put(friends[i], i); // map에 정보 저장
        }
        
        for (int i = 0; i < gifts.length; i++) {
            String[] str = gifts[i].split(" ");
            int a = person.get(str[0]); // 선물 준 사람
            int b = person.get(str[1]); // 선물 받은 사람
            count[a][b] += 1; // 선물 주고 받은 횟수 체크
            point[a][0] += 1; point[b][1] += 1; // 선물 지수 체크
        }
        
        for (int i = 0; i < len; i++) {
            point[i][2] = point[i][0] - point[i][1]; // 선물 지수 계산
        }
        
        for (int i = 0; i < len; i++) {
            int gift = 0;
            for (int j = 0; j < len; j++) {
                if (i == j) continue;
                // 주고 받은 선물 비교
                int give = count[i][j];
                int receive = count[j][i];
                if (give > receive) {
                    gift += 1;
                } else if (give == receive) { // 선물 지수 비교
                    int a = point[i][2];
                    int b = point[j][2];
                    if (a > b) gift += 1;
                }
            }
            answer = Math.max(gift, answer);
        }
        return answer;
    }
}