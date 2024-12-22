import java.util.*;

class Solution {
    public int solution(int n, int[][] results) {
        boolean[][] graph = new boolean[n+1][n+1];
        
        // 결기 결과를 그래프에 반영
        for(int[] result : results){
            int winner = result[0];
            int loser = result[1];
            graph[winner][loser] = true;
        }
        
        // 승패 관계 추론
        for(int k = 1; k <= n; k++) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    if(graph[i][k] && graph[k][j]) {
                        graph[i][j] = true;
                    }
                }
            }
        }
        int answer = 0;
        
        // 각 선수에 대해 정확한 순위를 알 수 있는지 확인
        for(int i = 1; i <= n; i++) {
            int count = 0;
            for(int j = 1; j <= n; j++) {
                if(graph[i][j] || graph[j][i]) {
                    count++;
                }
            }
            
            // 자기 자신을 제외한 모든 선수와 승패 관계가 명확하면 순위를 알 수 있음
            if(count == n-1) {
                answer++;
            }
        }
        return answer;
    }
}