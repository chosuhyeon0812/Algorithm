import java.util.*;

class Solution {
    public int solution(String numbers) {
        // 중복 방티를 위해 set...
        Set<Integer> all = new HashSet<>();
        
        // 가능한 모든 순열을 조합해서 set에 넣기
        generateNumber("", numbers, all);
        
        // 소수 판별 &s 카운트
        int cnt = 0;
        for(int i : all) {
            if(isPrime(i)){
                cnt++;
            }
        }
        return cnt;
    }
    
    // 소수 찾기 함수
    private Boolean isPrime(int num) {
        if(num < 2) return false;
        else{
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    // 수를 활용한 모든 순열 구하는 함수
    private void generateNumber(String str, String numbers, Set<Integer> all) {
        if(!str.isEmpty()) {
            all.add(Integer.parseInt(str));
        }
        for(int i = 0; i < numbers.length(); i++) {
            String next_str = str + numbers.charAt(i);
            String next_remaining = numbers.substring(0, i) + numbers.substring(i+1);
            generateNumber(next_str, next_remaining, all);
        }
        
    } 
}