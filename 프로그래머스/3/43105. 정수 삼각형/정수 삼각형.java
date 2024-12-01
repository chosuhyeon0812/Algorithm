class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        
        // dp 배열 생성
        int [][] dp = new int[n][n];
        
        // dp 배열 초기화
        for(int i = 0; i < n; i++){
            dp[n-1][i] = triangle[n-1][i];
        }
        
        // 위로 올라가면서 dp 계산
        for(int i = n-2; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                // 현재 위치에서 아래흥 양쪽 중 더 큰 값을 선택
                dp[i][j] = triangle[i][j] + Math.max(dp[i+1][j], dp[i+1][j+1]);
            }
        }
        
        // 꼭대기 값 반환
        return dp[0][0];
    }
}