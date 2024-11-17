import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 각 기능이 완료되는데 필요한 일수를 저장할 리스트..
        List<Integer> days = new ArrayList<>();
        
        // 각 기능에 대해 완료되는데 필요한 일수 계산
        for(int i = 0; i < progresses.length; i++) {
            int remainingProgress = 100 - progresses[i];
            int requiredDays = (int) Math.ceil((double) remainingProgress / speeds[i]);
            days.add(requiredDays);
        }
        
         // 배포할 기능 수를 저장하는 리스트
        List<Integer> release = new ArrayList<>();
        
         // 첫번째 기능의 완료 일수를 기준으로 초기 설정
        int currentMaxDay = days.get(0);
        int count = 0;
        
        // 각 기능의 총 완료 일을 순차적으로 확인
        for(int day : days) {
            if(day <= currentMaxDay) {
                count++;
            } else {
                // 새로운 배포 그룹 시작
                release.add(count);
                count = 1;
                currentMaxDay = day;
            }
        }
        
        // 마지막 배포 그룹 추가
        release.add(count);
        
        // 결과 배열로 변환
        int[] result = new int[release.size()];
        for(int i = 0; i < release.size(); i++) {
            result[i] = release.get(i);
        }
        return result;
    }
}