import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strings = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strings, (a, b) -> (b + a).compareTo(a + b));
        
        StringBuilder result = new StringBuilder();
        for(String s : strings) {
            result.append(s);
        }
        
        if(result.toString().startsWith("0")){
            return "0";
        }
        
        return result.toString();
    }
}