import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < wires.length; i++) {
            List<List<Integer>> network = new ArrayList<>();
            for(int j = 0; j <= n; j++) {
                network.add(new ArrayList<>());
            }
            
            for(int j = 0; j < wires.length; j++) {
                if(i == j) continue;    // 전선 하나를 끊음
                network.get(wires[j][0]). add(wires[j][1]);
                network.get(wires[j][1]).add(wires[j][0]);
            }
            
            boolean[] visited = new boolean[n + 1];
            int towerCount = countTowers(1, network, visited);
            int diff = Math.abs((n - towerCount) - towerCount);
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
    
    private int countTowers(int start, List<List<Integer>> network, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        int count = 1;
        
        while(!queue.isEmpty()) {
            int node = queue.poll();
            for(int neighbor : network.get(node)) {
                if(!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    count++;
                }
            }
        }
        return count;
    }
}