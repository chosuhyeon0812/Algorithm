import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        int boats = 0;
        
        while(left <= right) {
            if(people[left] + people[right] <= limit) {
                // 가장 가벼운 사람과 가장 무거운 사람이 합께 탈 수 있는 경우
                left++;
            }
            // 가장 무거운 사람 보트에 탑승
            right--;
            boats++;
        }
        return boats;
    }
}