class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0; // 네트워크 개수
        
        // 모든 컴퓨터 dfs 수행
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(computers, visited, i);
                answer++;
            }
        }
        return answer;
    }
    
    private void dfs(int[][] computers, boolean[] visited, int node) {
        visited[node] = true;
        
        for(int i = 0; i < computers.length; i++) {
            if(computers[node][i] == 1 && !visited[i]) {
                dfs(computers, visited, i);
            }
        }
    }
}