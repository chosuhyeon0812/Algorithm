import java.util.*;

public class Solution {
    public int solution(int n) {
        int battery = 0;

        // N이 0이 될 떄까지 반복
        while(n > 0) {
            // N이 홀수일 경우 1칸 점프
            if(n % 2 == 1){
                battery++;
                n--;
            }
            // 짝수면 순간이동
            n /= 2;
        }
        return battery;
    }
}