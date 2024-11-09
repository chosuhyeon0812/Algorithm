import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) { 
            int start = commands[i][0] -1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;
            
            // 배열의 특정 구간을 복사하고 정렬
            int[] arr = Arrays.copyOfRange(array, start, end);
            Arrays.sort(arr);
            
            // k번째 숫자를 결과 배열에 추가
            answer[i] = arr[k];
            
            }
        return answer;
    }
}