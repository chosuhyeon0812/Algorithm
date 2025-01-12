class Solution {
    static int maxDungeons = 0;
    public int solution(int k, int[][] dungeons) {
        // 방문 여부 체크 배열
        boolean[] visited = new boolean[dungeons.length];
        explore(k, dungeons, visited, 0);
        return maxDungeons;
    }
    
    private static void explore(int k, int[][] dungeons, boolean[] visited, int count) {
        // 현재 탐험한 던전 수들 최대값과 비교하여 갱신
        maxDungeons = Math.max(maxDungeons, count);
        
        for(int i = 0; i < dungeons.length; i++) {
            if(!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;  // 현재 던전을 방문
                explore(k - dungeons[i][1], dungeons, visited, count+1);    // 피로도 소모하고 다음 탐험
                visited[i] = false;     // 탐험후 상태 초기화
            }
        }
    }
} 