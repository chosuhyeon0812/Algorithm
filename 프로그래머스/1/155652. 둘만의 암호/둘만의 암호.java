class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()) {
            result.append(shift(c, skip, index));
        }
        return result.toString();
    }
    
    private char shift(char original, String skip, int index) {
        int count = 0;
        char current = original;
        
        while(count < index) {
            current = nextChar(current);
            if(skip.indexOf(current) == -1) {
                count++;
            }
        }
        return current;
    }
    
    private char nextChar(char c) {
        if(c == 'z') {
            return 'a';
        } else {
            return (char) (c+1);
        }
    }
}