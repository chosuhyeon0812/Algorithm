class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int target = x;
        int hasad = 0;
        while (x > 0) {
            hasad += x % 10;
            x /= 10;
        }
        
        // System.out.println(hasad);
        if (target % hasad != 0) {
            answer = false;
        }
            
        return answer;
    }
} 