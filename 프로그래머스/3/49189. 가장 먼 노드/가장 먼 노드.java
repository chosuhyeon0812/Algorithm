import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for(int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean [n+1];
        int[] distances = new int[n+1];
        
        queue.add(1);
        visited[1] = true;
        
        while(!queue.isEmpty()) {
            int current = queue.poll();
            for(int neighbor : graph.get(current)) {
                if(!visited[neighbor]) {
                    visited[neighbor] = true;
                    distances[neighbor] = distances[current] + 1;
                    queue.add(neighbor);
                }
            }
        }
        int maxDistance = Arrays.stream(distances).max().getAsInt();
        int count = 0;
        for(int distance : distances) { 
            if(distance == maxDistance) {
                count++;
            }
        }
        return count;
    }
}