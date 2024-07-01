class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] factor = {781, 156, 31, 6, 1};
        
        String vowels = "AEIOU";
        for(int i = 0; i < word.length(); i++) {
            int pos = vowels.indexOf(word.charAt(i));
            answer += pos * factor[i] + 1;
        }
        return answer;
    }
}