import java.util.*;

class Solution {
    public int solution(int[] citations) {
    Arrays.sort(citations);
    int h = 0;
    for(int i = 0; i < citations.length; i++) {
        // 남은 논문의 수
        int cnt = citations.length - i;
        
        // 남은 논문의 수보다 현재 나의 인용된 논문수가 이상이면 종료!
        if(cnt <= citations[i]) {
            h = cnt;
            break;
        }
    }
        
    return h;
    }
}