class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        // 직원 수
        int workers = schedules.length;
        for (int i = 0; i < workers; i++) {
            int day = startday;
            // 직원 별로 출근 시간을 잘 지켰는지 체크
            int hour = schedules[i] / 100;
            int min = schedules[i] % 100 + 10;
            if (min >= 60) {
                hour += 1;
                if (hour >= 12) hour = 0;
                min -= 60;
            }
            int planTime = hour * 100 + min;
            boolean flag = true;
            for (int t = 0; t < timelogs[i].length; t++) {
                if (day == 6) {
                    day += 1; 
                    continue;
                }
                else if (day == 7) {
                    day = 1; // 요일 초기화
                    continue;
                }
                int checkTime = timelogs[i][t];
                if (checkTime > planTime) {
                    flag = false;
                    break;
                }
                day += 1;
            }
            if (flag) answer += 1;
        }
        return answer;
    }
}