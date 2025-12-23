class Solution {
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long answer = -1;
        // a = 0, b = 0 일 경우 예외처리
        if (a == 0 && b == 0) return 0;
        long r = 0;
        for (int i = 0; i < g.length; i++) {
            long time = (((long) Math.ceil((double)(g[i] + s[i]) / w[i])) * 2 - 1) * t[i];
            r = Math.max(r, time);
        }
        
        long l = 0;
        while(l < r) {
            long mid = (l + r) / 2;
            
            boolean flag = calc(a, b, g, s, w, t, mid);
            
            if (flag) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    
    private boolean calc(int a, int b, int[] g, int[] s, int[] w, int[] t, long time) {
        long gold_total = 0;
        long silver_total = 0;
        long total = 0;
        
        for (int i = 0; i < g.length; i++) {
            long calc = ((time / t[i]) + 1) / 2 * w[i];

            gold_total += Math.min(g[i], calc);
            silver_total += Math.min(s[i], calc);
            total += Math.min(g[i] + s[i], calc);
        }
        
        if (gold_total >= a && silver_total >= b && total >= (a+b)) return true;
        return false;
    }
}