import java.util.*;

class Solution {
    boolean[] isVisited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        isVisited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (isVisited[i]) continue;
            answer += 1;
            dfs(i, computers);
        }
        
        return answer;
    }
    
    void dfs(int current, int[][] computers) {
        isVisited[current] = true;
        
        int len = isVisited.length;
        
        for (int j = 0; j < len; j++) {
            if (computers[current][j] == 1 && !isVisited[j])
                dfs(j, computers);
        }
    }
}