class Solution {
    public String solution(String s) {
        String answer  = "";
        
        String[] numbers = s.split(" ");
        int min = 1000000000;
        int max = -10000000;
        
        for (int i = 0; i < numbers.length; i++){
            int number = Integer.parseInt(numbers[i]);
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        answer = min + " " + max;
        return answer;
    }
}