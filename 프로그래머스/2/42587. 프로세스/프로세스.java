import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++){
            queue.offer(new Process(priorities[i], i));
        }
        
        int executionOrder = 0;
        
        while(!queue.isEmpty()){
            Process current = queue.poll();
            // 더 높은 우선순위가 있는지 확인하려고..
            boolean high = false;
            
            // 큐에 남아있는 프로세스들 중 현재 프로세스보다 높은 우선순위가 있는지 확인
            for(Process p : queue) {
                if(p.priority > current.priority) {
                    // 더 높은 프로세스가 있다면 반복문 종료
                    high = true;
                    break;
                }
            }
            
            // 더 높은 우선순위가 있는 경우 현재 프로세스를 다시 큐에 넣음
            if(high) {
                queue.offer(current);
            } else {
                // 더 높은 우선순위가 없는 경우 프로세스 실행
                executionOrder++;
                if(current.location == location) {
                    return executionOrder;
                }
            }
        }
        return -1;
    }
    
    private static class Process {
        int priority;
        int location;
        
        Process(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }
}