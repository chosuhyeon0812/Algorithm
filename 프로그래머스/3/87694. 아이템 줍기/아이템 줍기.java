import java.util.*;

class Solution {
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {1, -1, 0, 0};
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] map = new int[102][102];
        boolean[][] visited = new boolean[102][102];
        
        for(int[] rect : rectangle) {
            int x1 = rect[0] * 2, y1 = rect[1] * 2;
            int x2 = rect[2] * 2, y2 = rect[3] * 2;
            
            for(int i = x1; i <= x2; i++) {
                for(int j = y1; j <= y2; j++) {
                    if(i == x1 || i == x2 || j == y1 || j == y2) {
                        if(map[i][j] != 2) map[i][j] = 1;
                    } else {
                        map[i][j] = 2;
                    }
                }
            }
        }
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{characterX * 2, characterY * 2, 0});
        visited[characterX * 2][characterY * 2] = true;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1], distance = current[2];
            
            if(x == itemX * 2 && y == itemY * 2) {
                return distance / 2;
            }
            
            // 4방향 탐색
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                if(nx >= 0 && nx < 102 && ny >= 0  && ny < 102) {
                    if(!visited[nx][ny] && map[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny, distance+1});
                    }
                }
            }
        }
        return 0;
    }
}