import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        // 보드 배열..
        char[][] map = new char [m][n];
        
        // 입력받은 문자열 배열을 2차원 문자 배열로 변환
        for(int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }
        
        int answer = 0; // 지워진 블록의 총 개수를 저장하는 변수
        boolean found; // 더 이상 지울 블록이 있는지의 여부 확인..
        
        do {
            boolean[][] toBeRemoved = new boolean[m][n]; // 지울 블록을 표시할 배열
            found = false; // 지울 블록이 잇는지 여부 초기화
            
            // 모든 2*2블록 찾기..
            for(int i = 0; i < m - 1; i++) {
                for(int j = 0; j < n - 1; j++) {
                    char block = map[i][j];
                    // 현재 블록이 공백이 아니고 2*2 블록을 이루는 경우
                    if(block != ' ' && block == map[i][j+1] && block == map[i+1][j] && block == map[i+1][j+1]) {
                        toBeRemoved[i][j] = true;
                        toBeRemoved[i][j+1] = true;
                        toBeRemoved[i+1][j] = true;
                        toBeRemoved[i+1][j+1] = true;
                        found = true;
                    }
                }
            }
            
            // 블록 제거 및 카운트..
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(toBeRemoved[i][j]) {
                        map[i][j] = ' ';
                        answer++;
                    }
                }
            }
            
            // 블록 떨어뜨리기
            for(int j = 0; j < n; j++) {
                for(int i = m-1; i >= 0; i--) {
                    if(map[i][j] == ' ') {
                        for(int k = i - 1; k >= 0; k--) {
                            if(map[k][j] != ' ') {
                                map[i][j] = map[k][j];
                                map[k][j] = ' ';
                                break;
                            }
                        }
                    }
                }
            }
        } while (found);
        
        return answer;
    }
}