import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            double a = ((100.0 - progresses[i]) / speeds[i]);
            queue.add((int) Math.ceil(a));
        }
        
        int n = 0;
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            System.out.println(poll);
            if (poll > n) {
                n = poll;
                answer.add(1);
            } else {
                int len = answer.size() - 1;
                answer.set(len, answer.get(len)+1);
            }
        }
        
        
        return answer;
    }
}