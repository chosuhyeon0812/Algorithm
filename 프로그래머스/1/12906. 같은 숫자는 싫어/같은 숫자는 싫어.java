import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        // 첫번째는 일단 추가
        list.add(arr[0]);
        
        // 두번째부터는 확인하면서 중복 제거
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                list.add(arr[i]);
            }
        }
        
        // ArrayList를 배열로 변환
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}