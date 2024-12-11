class Solution {
    public int[] solution(int brown, int yellow) {
        // 카펫 총 넓이
        int carpet = brown + yellow;
        
        // 높이는 최소 3이상 
        for(int height = 3; height <= (carpet/height); height++){
            if(carpet % height == 0) {
                int width = carpet / height;
            
            
                if((height - 2) * (width - 2) == yellow) {
                    return new int[]{width, height};
                }
            }
        }
        return null;
    } 
}