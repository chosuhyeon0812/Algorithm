import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int length = number.length();
        
        for(int i = 0; i < length; i++) {
            char current = number.charAt(i);
            
            // 비어있지 않고 제거할 수가 남아있고 들어있는 마지막 수보다 크면 마지막 수 제거하고 추가하기 
            // 제거하는 수 -1
            while(!stack.isEmpty() && k > 0 && stack.peek() < current) {
                stack.pop();
                k--;
            }
            
            // 비어있으면 추가
            stack.push(current);
        }
        
        // 제거 횟수가 남은경우 뒤에서 부터 제거 
        while(k > 0) {
            stack.pop();
            k--;
        }
        
        // 스택을 문자열로 반환
        StringBuilder result = new StringBuilder();
        for(char c : stack) {
            result.append(c);
        }
        
        return result.toString();
    }
}