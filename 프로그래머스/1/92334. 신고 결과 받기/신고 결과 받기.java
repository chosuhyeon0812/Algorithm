import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 신고 기록 맵
        Map<String, Set<String>> reportm = new HashMap<>();
        // 신고당한 횟수 맵
        Map<String, Integer> count = new HashMap<>();
        
        for(String id : id_list) {
           reportm.put(id, new HashSet<>());
           count.put(id, 0);
        }
        
        // 신고 처리..
        for(String rep : report) {
            String[] parts = rep.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            if(!reportm.get(reporter).contains(reported)) {
                reportm.get(reporter).add(reported);
                count.put(reported, count.get(reported) + 1);
            }
        }
        
        // 이용 정지된 유저 목록..
        List<String> xusers = new ArrayList<>();
        for(String id : id_list) {
            if(count.get(id) >= k) {
                xusers.add(id);
            }
        }
        
        // 각 유저별 메일을 받은 횟수
        int[] result = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            Set<String> reports = reportm.get(user);
            int mailCount = 0;
            for (String xuser : xusers) {
                if(reports.contains(xuser)){
                    mailCount++;
                }
            }
            result[i] = mailCount;
        }
        return result;
    }
}