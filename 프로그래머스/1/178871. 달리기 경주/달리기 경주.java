import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // key : 선수 이름, value : 등수
        Map<String, Integer> play = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            play.put(players[i], i);
        }
        
        // 배열 순회하면서 선수의 위치 업데이트
        for(String call : callings) {
            int current = play.get(call);
            // 첫번째 선수는 불리지 않으니까 0봐다 클때..
            if(current > 0) {
                // 앞의 선수와 위치 교환
                String change = players[current-1];
                players[current -1] = call;
                players[current] = change;
                
                // 등수 업데이트
                play.put(call, current-1);
                play.put(change, current);
            }
        }
        return players;
    }
}