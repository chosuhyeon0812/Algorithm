import java.util.*;
class Solution {
    // 사방 탐색
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        // 시작 위치를 큐에 넣기
        queue.add(new int[]{0, 0});
        
        // 시작 위치를 방문표시
        maps[0][0] = 1;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            // 목적지에 도달했을 때는 경로의 길이를 반환
            if(x == n-1 && y == m-1) {
                return maps[x][y];
            }
            
            // 4방탐색
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 유효한 위치이고, 방문하지 않으면 큐에 추가
                if(nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1){
                    queue.add(new int[]{nx, ny});
                    // 이동한 칸에 이동 횟수 기록
                    maps[nx][ny] = maps[x][y] + 1;
                }
            }
        }
        // 혹시 몰라 목적지에 도달 못한다면... 그럴 수 없음...
        return -1;
    }
}