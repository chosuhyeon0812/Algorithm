import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        // 초기값을 -1로 채워넣습니다
        Arrays.fill(answer, -1); 
        
        for (int i=0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            // 최소값을 저장할 변수, 일단 최대값으로 초기화
            int min_value = Integer.MAX_VALUE;
            
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < min_value) {
                    min_value = arr[j];
                }
            }
            if (min_value != Integer.MAX_VALUE) {
                answer[i] = min_value;
            }
        }
        return answer;
    }
}