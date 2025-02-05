import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        Arrays.sort(costs, Comparator.comparingInt(a -> a[2]));
        
        int[] parent = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        int totalCost = 0;
        int edgeUsed = 0;
        
        for(int[] cost : costs) {
            int island1 = cost[0];
            int island2 = cost[1];
            int bridgeCost = cost[2];
            
            if(findParent(island1, parent) != findParent(island2, parent)) {
                union(island1, island2, parent);
                totalCost += bridgeCost;
                edgeUsed++;
                
                if(edgeUsed == n - 1) {
                    break;
                }
            }
        }
        
        return totalCost;
    }
    
    private int findParent(int node, int[] parent) {
        if(parent[node] == node) {
            return node;
        }
        return parent[node] = findParent(parent[node], parent);
    }
    
    private void union(int node1, int node2, int[] parent) {
        int root1 = findParent(node1, parent);
        int root2 = findParent(node2, parent);
        
        if(root1 != root2) {
            parent[root2] = root1;
        }
    }
}