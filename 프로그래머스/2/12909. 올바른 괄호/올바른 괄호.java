import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String> str = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '(') {
                str.push(String.valueOf(c));
            } else if(c ==')') {
                if(str.isEmpty()) {
                    answer = false;
                } else {
                    str.pop();
                }
            }
        }
        
        if(!str.isEmpty()) {
            answer = false;
        }
        
        return answer;
    }
}