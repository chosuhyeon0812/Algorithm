import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        // 차량의 경로를 종료 지점 기준으로 정렬
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        
        int cameraCnt = 0;
        int lastCameraPosition = Integer.MIN_VALUE;
        
        // 차량의 경로를 확인하며 카메라 배치
        for(int[] route : routes) {
            int entry = route[0]; // 진입 지점
            int exit = route[1];  // 진출 지점
            
            // 현재 카메라 위치로 해당 차량을 감시하지 못하면 새로운 카메라 설치
            if(lastCameraPosition < entry) {
                cameraCnt++;
                lastCameraPosition = exit;  // 새로운 카메라 위치 갱신
            }
        }
        
        return cameraCnt;
    }
}