class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int[] size : sizes) {
            // 큰 값을 가로로, 작은 값을 세로로 배치
            int width = Math.max(size[0], size[1]);
            int height = Math.min(size[0], size[1]);
            
            // 가로와 세로의 최대값 갱신
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }
        
        // 지갑 크기 계산..
        return maxWidth * maxHeight;
    }
}