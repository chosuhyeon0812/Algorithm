import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        
        for(int i : ingredient) {
            stack.push(i);
            
            // 스택의 크기가 4 이상일 때 체크 가능
            if(stack.size() >= 4) {
                int size = stack.size();
                
                // 순서 빵, 야채, 고기, 빵인지 확인
                if(stack.get(size-4) == 1 && stack.get(size-3) ==2 && stack.get(size-2) == 3 && stack.get(size-1) == 1){
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    count++;
                }
            }
        }
        return count;
    }
}