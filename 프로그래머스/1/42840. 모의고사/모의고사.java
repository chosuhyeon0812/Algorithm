import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자들의 패턴 정의
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 점수를 계산할 배열
        int[] scores = new int[3];
        
        // 각 문제에 대해 수포자들의 답안을 비교하여 점수 계산
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == pattern1[i % pattern1.length]) {
                scores[0]++;
            }
            if(answers[i] == pattern2[i % pattern2.length]) {
                scores[1]++;
            }
            if(answers[i] == pattern3[i % pattern3.length]) {
                scores[2]++;
            }
        }
        
        // 제일 높은 점수를 찾음
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        // 가장 높은 점수를 받은 수포자를 리스트에 추가
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == maxScore) {
                result.add(i+1);
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}