import java.util.*;


class Solution {
    static class Node {
        String word;
        int steps;
        
        Node(String word, int steps) {
            this.word = word;
            this.steps = steps;
        }
    }
    public int solution(String begin, String target, String[] words) {
      // words에 target이 없는 경우 0 바로 반환
        boolean isTarget = Arrays.asList(words).contains(target);
        if(!isTarget) {
            return 0;
        }
        
        // bfs를 위한 큐
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(begin, 0));
        
        // 방문 여부를 저장할 Set
        Set<String> visited = new HashSet<>();
        visited.add(begin);
        
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            
            // target에 도달한 경우
            if(current.word.equals(target)) {
                return current.steps;
            }
            
            // words에서 변환 가능한 단어를 찾아 큐에 추가
            for(String word : words) {
                if(!visited.contains(word) && canTransform(current.word, word)) {
                    visited.add(word);
                    queue.add(new Node(word, current.steps + 1));
                }
            }
        }
        // target에 도착할 수 없는 경우
        return 0;
    }
    
    // 두 단어가 한 글자만 다른지 확인하는 함수
    private boolean canTransform(String word1, String word2) {
        int differences = 0;
        for(int i = 0; i < word1.length(); i++) {
            if(word1.charAt(i) != word2.charAt(i)) {
                differences++;
            }
            if(differences > 1) {
                return false;
            }
        }
        return differences == 1;
    }
}