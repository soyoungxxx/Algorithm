import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        int count = 0;
        
        Arrays.sort(costs, (a, b) -> a[2] - b[2]);
        
        int[] parents = new int[n];
        
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }
        
        for (int i = 0; i < costs.length; i++) {
            int a = costs[i][0];
            int b = costs[i][1];
            
            int ra = find(parents, a);
            int rb = find(parents, b);
            
            if (ra == rb) continue;
            parents[ra] = rb;
            count += 1;
            answer += costs[i][2];
            if (count == n-1) break;
        }
        return answer;
    }
    
    int find(int[] parents, int x) {
        if (parents[x] == x) return x;
        return parents[x] = find(parents, parents[x]);
    }
}