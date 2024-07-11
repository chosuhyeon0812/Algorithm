import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        // 우선순위 큐를 사용해서 최소 힙 만들기..
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // 모든 스코빌 지수를 PriorityQueue에 추가..
        for(int scov : scoville) {
            minHeap.add(scov);
        }
        
        int count = 0;
        
        // 힙에서 가장 작은 요소가 k 이상이 될 때까지 반복...
        while(minHeap.peek() < K) {
            // 힙의 크기가 2보다 작으면 더 이상 섞을 수 없으므로 -1을 반환
            if(minHeap.size() < 2) {
                return -1;
            }
            
            // 가장 맵지 않은 음식과 드 위에 껄 꺼내서 섞기
            int first = minHeap.poll();
            int second = minHeap.poll();
            int newFood = first + (second * 2);
            
            // 섞은 새로운 음식을 힙에 추가..
            minHeap.add(newFood);
            count++;
            
        }
        
        // 모든 음식의 스코빌 지우사 k이상이 되면 섞은 횟수를 반환
        return count;
    }
}