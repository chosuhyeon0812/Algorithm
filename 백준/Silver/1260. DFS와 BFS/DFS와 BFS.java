import java.awt.print.Pageable;
import java.util.*;

public class Main {

    static boolean visited[];
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();

        arr = new ArrayList[n+1];
        for (int i = 1; i <= n; i++){
            arr[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr[s].add(e);
            arr[e].add(s);
        }

        // 번호가 적은것을 먼저 방문하기 위해 정렬하기
        for (int i = 1; i <= n; i++){
            Collections.sort(arr[i]);
        }
        visited = new boolean[n+1];
        dfs(start);
        System.out.println();
        visited = new boolean[n+1];
        bfs(start);
        System.out.println();
    }

    public static void dfs(int node){
        System.out.print(node + " ");
        visited[node] = true;
        for (int i : arr[node]){
            if (!visited[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int node){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        visited[node] = true;

        while(!queue.isEmpty()) {
            int now_node = queue.poll();
            System.out.print(now_node + " ");
            for (int i : arr[now_node]){
                if (!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            };
        }
    }
}
