import java.util.*;

class Solution {
    public int solution(int n, int k) {
        // k진수로 변환
        String knum = Integer.toString(n, k);
        
        // 변환된 k진수 문자열을 0기준으로 분할
        String[] numbers = knum.split("0");
        
        // 분할한 문자열이 소수인지 확인하고 카운트..
        int count = 0;
        for(String number : numbers) {
            // 빈 문자열이 아니고 소수이면 카운트 증가
            if(!number.isEmpty() && isPrime(Long.parseLong(number))){
                count++;
            } 
        }
        return count;
    }
    
    // 소수 확인 함수
    private boolean isPrime(long num) {
        if(num < 2) return false;
        for(long i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}