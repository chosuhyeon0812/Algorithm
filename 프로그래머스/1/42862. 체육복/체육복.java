import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져왔지만 도난당한 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1; // 이미 여벌의 체육복이 있는 경우
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        // 도난당한 학생에게 빌려줄 수 있는 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    reserve[j] = -1; // 빌려준 학생은 -1로 표시
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
