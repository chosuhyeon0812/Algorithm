import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        // 바위 위치 정렬
        Arrays.sort(rocks);
        
        // 이분 탐색을 위한 변수
        int low = 1; // 거리의 최소값
        int high = distance; // 거리의 최댓값
        int answer = 0;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            int removedRocks = 0;
            int prev = 0; // 이전의 위치
            
            for(int rock : rocks) {
                // 거리가 mid 미만이면 바위 제거
                if(rock - prev < mid) {
                    removedRocks++;
                } else { // 거리가 mid 이상이면 이동
                    prev = rock;
                }
            }
            
            // 마지막 도착지점까지 거리 확인
            if(distance - prev < mid) {
                removedRocks++;
            }
            
            // 제거한 바위 개수가 n이하인지 확인
            if(removedRocks <= n) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return answer;
    }
}