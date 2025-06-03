import java.util.*;

class Task {
    String name;
    int startTime, playTime;
    public Task(String name, int startTime, int playTime) {
        this.name = name;
        this.startTime = startTime;
        this.playTime = playTime;
    }
}

class Solution {
    public List<String> solution(String[][] plans) {
        List<String> answer = new ArrayList<>();
        
        // 우선순위 큐
        PriorityQueue<Task> queue = new PriorityQueue<>(
            (o1, o2) -> (o1.startTime - o2.startTime)
        );
        
        // task 객체 만들어서 우선순위 큐에 집어넣기
        for (int i = 0; i < plans.length; i++) {
            String name = plans[i][0];
            String[] time = plans[i][1].split(":");
            int h = Integer.parseInt(time[0]);
            int m = Integer.parseInt(time[1]);
            int startTime = (h * 60) + m;
            int playTime = Integer.parseInt(plans[i][2]);
            
            Task task = new Task(name, startTime, playTime);
            queue.add(task);
        }
        
        // 멈춘 항목이 담길 Stack
        Stack<Task> stack = new Stack<>();
        
        while(!queue.isEmpty()) {
            Task task = queue.poll();
            
            String currentTaskName = task.name;
            int currentStartTime = task.startTime;
            int currentPlayTime = task.playTime;
            
            int currentTime = currentStartTime;
        
            
            // 새로운 작업 존재
            if (!queue.isEmpty()) {
                Task nextTask = queue.peek();
                
                // 다음 작업 전까지 지금 작업 끝낼 수 있으면
                if (currentTime + currentPlayTime < nextTask.startTime) {
                    // 지금 작업 끝났어용
                    answer.add(currentTaskName);
                    // 현재 시간 바뀌어용
                    currentTime += currentPlayTime;
                    
                    // 그 사이에 남은 작업 수행도 되나용
                    while (!stack.isEmpty()) {
                        Task remainTask = stack.pop();
                        
                        // 끝내보져
                        if (currentTime + remainTask.playTime <= nextTask.startTime) {
                            // 남은 작업 끝
                            currentTime += remainTask.playTime;
                            answer.add(remainTask.name);
                            continue;
                        }
                        
                        // 못 끝내면
                        else {
                            // 할 수 있는 만큼만 해라
                            int t = nextTask.startTime - currentTime;
                            remainTask.playTime -= t;
                            stack.push(remainTask);
                            break;
                        }
                    }
                }
                
                // 딱 ㄷ맞아 떨어지면
                else if (currentTime + currentPlayTime == nextTask.startTime) {
                    answer.add(task.name);
                    continue;
                }
                
                // 지금 작업 못 끝내면 할 수 있는 만큼만
                else {
                    int t2 = nextTask.startTime - currentTime;
                    task.playTime -= t2;
                    stack.push(task);
                }
            }
            
            // 새 과제 없음
            else {
                // 남은 과제도 없음
                if (stack.isEmpty()) {
                    answer.add(task.name);
                    break;
                }
                // 남은 과제가 있는 경우
                else {
                    answer.add(task.name);
                    while(!stack.isEmpty()) {
                        Task remainTask = stack.pop();
                        answer.add(remainTask.name);
                    }
                }
            }
        }
        
        return answer;
    }
    
    
}