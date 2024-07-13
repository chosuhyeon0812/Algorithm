import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        // 유저 아이디와 닉네임을 매팅할 해시 맵..
        Map<String, String> userMap = new HashMap<>();
        // 최종 메시지 리스트
        List<String> messages = new ArrayList<>();
        
        // 입력한 기록을 순회
        for(String rec : record) {
            String[] parts = rec.split(" ");
            String command = parts[0];
            String userId = parts[1];
            
            if(command.equals("Enter")) {
                String nickname = parts[2];
                userMap.put(userId, nickname);
                messages.add(userId + "님이 들어왔습니다.");
            } else if(command.equals("Leave")) {
                messages.add(userId + "님이 나갔습니다.");
            } else if(command.equals("Change")) {
                String nickname = parts[2];
                userMap.put(userId, nickname);
            }
        }
        
        // 최종 메시지 리스트를 유저 아이디를 최종으로 변경된 닉네임으로 변경하여 출력하기.....
        String[] result = new String[messages.size()];
        for(int i = 0; i < messages.size(); i++) {
            String message = messages.get(i);
            int endIdx = message.indexOf("님");
            String userId = message.substring(0, endIdx);
            result[i] = message.replace(userId, userMap.get(userId));
        }
        
        return result;
    }
}