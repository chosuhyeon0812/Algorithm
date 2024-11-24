import java.util.*;

class Solution {
    public int solution(String name) {
        int moves = 0;
        int length = name.length();
        int minMove = length - 1;
        
        for(int i = 0; i < length; i++) {
            // 현재 문자를 'A'에서 목표 문자로 변경하는 비용 계산
            char c = name.charAt(i);
            moves += Math.min(c- 'A', 'Z' - c + 1);
            
            // 다음 위치의 연속된 'A'의 수를 확인하여 이동 최소화 계산
            int nextIndex = i + 1;
            while(nextIndex < length && name.charAt(nextIndex) == 'A') {
                nextIndex++;
            }
            
            // 최소 이동 계산
            minMove = Math.min(minMove, i + length - nextIndex + Math.min(i, length - nextIndex));
        }
        
        return moves + minMove;
    }
}