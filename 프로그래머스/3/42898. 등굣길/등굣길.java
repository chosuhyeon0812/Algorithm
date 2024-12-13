import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        final int MOD = 1_000_000_007; // 나머지 연산용
        int[][] dp = new int[n+1][m+1]; // 경로 저장용 배열
        
        // 물에 잠긴 지역 표시
        for(int[] puddle : puddles) {
            dp[puddle[1]][puddle[0]] = -1;
        }
        
        // 시작점 초기화
        dp[1][1] = 1;
        
        // dp 배열 채우기
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(dp[i][j] == -1){
                    dp[i][j] = 0;
                    continue;
                }
                
                // 위쪽에서 오는 경로 추가
                if(i > 1) {
                    dp[i][j] = (dp[i][j] + dp[i-1][j]) % MOD;
                }
                
                // 왼쪽에서 오는 경로 추가
                if(j > 1) {
                    dp[i][j] = (dp[i][j] + dp[i][j-1]) % MOD;
                }
            }
        }
        return dp[n][m];
    }
}