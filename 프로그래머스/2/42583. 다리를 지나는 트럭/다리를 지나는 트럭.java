import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int currentWeight = 0;
        
        for(int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }
        
        int index = 0;
        while(index < truck_weights.length || currentWeight > 0) {
            time++;
            
            // 다리에서 트럭이 빠져나옴
            int exitingTruck = bridge.poll();
            currentWeight -= exitingTruck;
            
            // 새로운 트럭이 다리에 올라갈 수 있는지 확인
            if(index < truck_weights.length && currentWeight + truck_weights[index] <= weight) {
                bridge.add(truck_weights[index]);
                currentWeight += truck_weights[index];
                index++;
            } else {
                bridge.add(0);
            }
        }
        return time;
    }
}