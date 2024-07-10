import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n]; // 결과 저장 배역..
        Stack<Integer> stack = new Stack<>(); // 인덱스 저장 스택..
        
        for(int i = 0; i < n; i++) {
            // 현재 가격이 스택의 맨 위 가격보다 낮을 때까지 스택에서 인덱스를 꺼내 처리
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                int j = stack.pop();
                // 가격이 떨어진 기간 계산
                answer[j] = i - j;
            }
            // 현재 인덱스를 스태겡 추가
            stack.push(i);
        }
        
        // 스택에 남아 있는 인덱스들에 대해 가격이 끝까지 떨어지지 않은 기간 계산
        while(!stack.isEmpty()) {
            int j = stack.pop();
            answer[j] = n - 1 - j; // 끝까지 가격이 떨어지지 않은 기간 계산
        }
        return answer;
    }
}