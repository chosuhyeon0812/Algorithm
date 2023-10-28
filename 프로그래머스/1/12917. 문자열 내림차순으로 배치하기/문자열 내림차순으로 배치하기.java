import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        
        for (int i = arr.length -1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        String answer = sb.toString();
        return answer;
    }
}