import java.util.*;
class Solution {
    public int[] solution(String msg) {

        // 사전 초기화
        Map<String, Integer> dictionary = new HashMap<>();
        int dictSize = 26;
        for(int i = 0; i < dictSize; i++) {
            dictionary.put(String.valueOf((char)('A' + i)), i+1);
        }
        
        List<Integer> result = new ArrayList<>();
        String w = "";
        int index = 27;
        
        for(char c : msg.toCharArray()) {
            String wc = w + c;
            if(dictionary.containsKey(wc)) {
                w = wc;
            } else {
                result.add(dictionary.get(w));
                dictionary.put(wc, index++);
                w = String.valueOf(c);
            }
        }
        
        // 마지막 남은 문자열 처리
        if(!w.isEmpty()) {
            result.add(dictionary.get(w));                 }
        
        // 결과를 int 배열로 변환
        int[] answer = new int[result.size()];
        for(int i = 0 ; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}