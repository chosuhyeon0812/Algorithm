import java.util.*;
import java.io.*;

class Solution {
    static int[] arr;
    static int answer;
    private static void sosu(int num){
        int cnt = 0;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                cnt++;             
            }
        }    
        if(cnt == 0){
            answer++;
        }
    }
    
    public int solution(int[] nums) {
            answer = 0;

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    sosu(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        return answer;
    }
}