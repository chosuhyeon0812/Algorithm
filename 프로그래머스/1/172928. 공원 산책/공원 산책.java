class Solution {
    public int[] solution(String[] park, String[] routes) {
        int height = park.length;
        int width = park[0].length();
        int[] current = Start(park, height, width);
        
        int[][] direction = {
            {-1, 0},   // N
            {1, 0},    // S
            {0, -1},   // W
            {0, 1}     // E
        };
        
        char[] dirC = {'N', 'S', 'W', 'E'};
        
        for(String route : routes) {
            String[] parts = route.split(" ");
            char dir = parts[0].charAt(0);
            int steps = Integer.parseInt(parts[1]);
            
            int idx = 0;
            for(int k = 0; k < 4; k++) {
                if(dirC[k] == dir) {
                    idx = k;
                    break;
                }
            }
            
            int row = current[0];
            int col = current[1];
            boolean move = true;
            
            for(int step = 0; step < steps; step++) {
                row += direction[idx][0];
                col += direction[idx][1];
                
                if(row < 0 || row >= height || col < 0 || col >= width || park[row].charAt(col) == 'X') {
                    move = false;
                    break;
                }
            }
            if(move) {
                current[0] = row;
                current[1] = col;
            }
        }
        return current;   
    }
    
    private int[] Start(String[] park, int height, int width) {
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                if(park[i].charAt(j) == 'S') {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}