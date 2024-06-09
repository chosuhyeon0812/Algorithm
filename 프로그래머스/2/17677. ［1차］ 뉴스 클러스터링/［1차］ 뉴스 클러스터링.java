import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        
        // 대소문자 -> 다 소문자로
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // 두 글자씩 끊어서 다중집합 만들기
        List<String> set1 = makeMultiSet(str1);
        List<String> set2 = makeMultiSet(str2);
        
        // 교집합, 합집합 계산
        List<String> intersection = new ArrayList<>();
        List<String> union = new ArrayList<>();
        
        // set1 복사
        List<String> tempSet1 = new ArrayList<>(set1);
        
        // 교집합 구하기
        for(String s : set2) {
            if(tempSet1.contains(s)){
                intersection.add(s);
                tempSet1.remove(s);
            }
        }
        
        // 합집합 구하기
        union.addAll(set1);
        for(String s : set2) {
            if(!set1.contains(s)) {
                union.add(s);
            } else {
                set1.remove(s);
            }
        }
        
        // 자카드 유사도 계산
        double jacard = union.size() == 0 ? 1 : (double) intersection.size() / union.size();
        
        // 결과값 반환
        return (int) (jacard * 65536);
    }
    
    public List<String> makeMultiSet(String str) {
        List<String> multiSet = new ArrayList<>();
        
        for(int i = 0; i < str.length() -1; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i+1);
            
            // 특수기호 뺴구 유효..
            if(Character.isLetter(first) && Character.isLetter(second)) {
                multiSet.add(first + "" + second);
            }
        }
        return multiSet;
    }
}