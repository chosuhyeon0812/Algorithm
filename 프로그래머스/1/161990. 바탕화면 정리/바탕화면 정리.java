class Solution {
    public int[] solution(String[] wallpaper) {
        int minX = 1000000000;
        int minY = 1000000000;
        int maxX = -1;
        int maxY = -1;
        
        // #의 위치를 찾아서 좌표 업데이트
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    if(i < minX) minX = i;
                    if(j < minY) minY = j;
                    if(i > maxX) maxX = i;
                    if(j > maxY) maxY = j;
                }
            }
        }
        return new int[] {minX, minY, maxX+1, maxY+1};
    }
}