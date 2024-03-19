import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {}; // 최종적으로 반환할 주차 요금 배열
        
        // 차량 번호와 마지막 입차 시간을 매핑하기 위한 맵
        Map<String, String> map = new HashMap<>();
        // 차량 번호와 누적 주차 시간을 매핑하기 위한 맵
        Map<String, Integer> feeMap = new HashMap<>();
        
        // 모든 차량에 대해 feeMap에 차량 번호와 초기 주차 시간(0분)을 등록
        for(int i = 0; i < records.length; i++){
            feeMap.put(records[i].split(" ")[1], 0);
        }
        
        // 주차 기록을 순회하며 입차와 출차 시간 계산
        for(int i = 0; i < records.length; i++){
            String[] infos = records[i].split(" "); // 시간, 차량번호, 입/출차 상태를 분리
            
            // 차량이 이미 입차한 상태라면 출차 처리
            if(map.containsKey(infos[1])){
                String[] inTime = map.remove(infos[1]).split(":"); // 입차 시간
                String[] outTime = infos[0].split(":"); // 출차 시간
                
                // 출차 시간과 입차 시간의 차이를 분 단위로 계산
                int hour = Integer.parseInt(outTime[0]) - Integer.parseInt(inTime[0]);
                int minute = Integer.parseInt(outTime[1]) - Integer.parseInt(inTime[1]);
                
                // 누적 주차 시간에 계산된 주차 시간 추가
                feeMap.replace(infos[1], feeMap.get(infos[1]) + 60 * hour + minute);
                
            }else{
                // 차량이 입차하는 경우 map에 차량 번호와 입차 시간을 저장
                map.put(infos[1], infos[0]); 
            }
        }
        
        // 출차 기록이 없는 차량에 대해 23:59까지의 주차 시간을 계산하여 추가
        for(String key : map.keySet()){
            String[] inTime = map.get(key).split(":"); // 마지막 입차 시간
            
            // 23:59까지의 주차 시간을 계산
            int hour = 23 - Integer.parseInt(inTime[0]);
            int minute = 59 - Integer.parseInt(inTime[1]);
            
            // 누적 주차 시간에 계산된 주차 시간 추가
            feeMap.replace(key, feeMap.get(key) + 60 * hour + minute);
        }
        
        // feeMap을 차량 번호 기준으로 정렬
        List<Map.Entry<String, Integer>> list = new ArrayList(feeMap.entrySet());
        Collections.sort(list, (o1, o2) -> {
            return Integer.parseInt(o1.getKey()) > Integer.parseInt(o2.getKey())?1 : 
            Integer.parseInt(o1.getKey()) < Integer.parseInt(o2.getKey())?-1 : 0;
        });
        
        // 요금 계산 결과를 저장할 배열 생성
        answer = new int[list.size()]; 
        
        // 차량 번호가 작은 자동차부터 청구 요금 내기
        for(int i = 0; i < answer.length; i++){
            // 기본 시간을 초과한 경우
            if(list.get(i).getValue() > fees[0]){ 
                answer[i] = fees[1] + (int) Math.ceil((list.get(i).getValue() - fees[0]) / (double)fees[2]) * fees[3];
            } // 기본 이내인 경우
            else{ 
                answer[i] = fees[1];
            }
        }
       
        return answer; // 계산된 요금 배열 반환
    }
}
