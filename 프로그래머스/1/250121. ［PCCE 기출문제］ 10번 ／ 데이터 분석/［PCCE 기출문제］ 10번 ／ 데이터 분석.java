import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int exidx = getIndex(ext);
        int sortidx = getIndex(sort_by);
        
        // 필터링 조건에 맞는 데이터만 추출
        int[][] datas = Arrays.stream(data)
            .filter(item -> item[exidx] < val_ext)
            .toArray(int[][]::new);
        
        // 정렬 조건에 맞게 데이터 정렬
        Arrays.sort(datas, Comparator.comparingInt(o -> o[sortidx]));
        
        
        return datas;
    }
    
    private static int getIndex(String key){
        switch(key) {
            case "code":
                return 0;
            case "date":
                return 1;
            case "maximum":
                return 2;
            case "remain":
                return 3;
            default:
                return 4;
        }
    }
}