import java.util.*;

class Solution {
    public int solution(int N, int number) {
        // 숫자 집합을 저장할 배열만들기
        Set<Integer>[] dp = new HashSet[9];
        
        for(int i = 1; i <= 8; i++) {
            dp[i] = new HashSet<>();
            
            // N을 1번 연속해서 사용한 숫자를 추가
            int num = Integer.parseInt(String.valueOf(N).repeat(i));
            dp[i].add(num);
        }
        
        // dp 배열을 채우면서 목표 숫자 찾기
        for (int i = 1; i <= 8; i++) {
            for(int j = 1; j < i; j++) {
                for(int num1: dp[j]) {
                    for(int num2: dp[i-j]) {
                        dp[i].add(num1 + num2);
                        dp[i].add(num1 - num2);
                        dp[i].add(num1 * num2);
                        if(num2 != 0) {
                            dp[i].add(num1 / num2);
                        }
                    }
                }
            }
            if(dp[i].contains(number)) {
                return i;
            }
        }
        return -1;
    }
}