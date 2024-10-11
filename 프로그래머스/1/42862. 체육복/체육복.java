import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n];
        
        for (int i = 0; i < n ; i++) {
            student[i] = 1;
        }
        for (int i = 0; i < lost.length; i++) { // 도난
            student[lost[i] - 1] -= 1;
        }
        for (int i = 0; i < reserve.length; i++) { // 여벌
            student[reserve[i] - 1] += 1;
        }
        for (int i = 0; i < n; i++) {
            if (i - 1 >= 0 && student[i - 1] == 0 && student[i] == 2) {
                student[i-1]++;
                student[i]--;
            } else if (i + 1 < n && student[i+1] == 0 && student[i] == 2) {
                student[i+1]++;
                student[i]--;
            }
        }
        for (int i = 0; i < n; i++) {
            if (student[i] == 1 || student[i] == 2) answer += 1;
        }
        return answer;
    }
}