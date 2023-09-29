class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        // 다 같은 경우
        if (a== b && b==c && c==d) {
            answer = 1111 * a;
        }
        // 하나 다른 경우
        else if ((a==b && b==c) || (b==c && c==d) || (c==d && d==a) || (d==a && a==b)) {
            int p;
            int q;
            
            if (a==b && b==c) {
                p = a;
                q = d;
            }
            else if(b==c && c==d) {
                p = b;
                q = a;
            }
            else if(c==d && d==a) {
                p = c;
                q = b;
            }else{
                p = d;
                q = c;
            }
            answer = (10 * p + q) * (10 * p + q);
        }
        // 두 숫자가 같고 나머지 두 숫자가 같거나 다른때를 또 나눔...
        else if (a==b || a==c || a==d || b==c || b==d || c==d) {
            int p = 0;
            int q = 0;
            int r = 0;
            
            if (a==b) {
                p = a;
                q = c;
                r = d;
            }
            else if (a==c) {
                p = a;
                q = b;
                r = d;
            }
            else if (a==d) {
                p = a;
                q = b;
                r = c;                
            }
            else if (b==c) {
                p = b;
                q = a; 
                r = d;
            }
            else if (b==d) {
                p = b;
                q = a;
                r = c;
            }
            else {
                p = c;
                q = a;
                r = b;
            }
    
            // 나머지 쌍이 다를때
            if (q != r) {
                answer = q * r;
            }
            
            // 나머지 쌍도 같을 떄
            else {
                answer = (p+q) * Math.abs(p-q);
            }
        }
        
        // 4개의 숫자가 모두 다를 때....
        else {
            int min = Math.min(Math.min(a,b), Math.min(c, d));
            answer = min;
        }
        return answer;
    }
}