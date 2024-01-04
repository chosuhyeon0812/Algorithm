import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int visitOrder = 1;
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        result = new int[n+1];
        arr = new ArrayList[n+1];

        for (int i = 1; i <= n; i++){
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arr[s].add(e);
            arr[e].add(s);
        }

        for (int i = 1; i <= n; i++){
            Collections.sort(arr[i]);
        }

        bfs(start);

        for (int i = 1; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    private static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        visited[node] = true;
        queue.add(node);
        result[node] = visitOrder;

        while(!queue.isEmpty()){
            int now_node = queue.poll();
            for(int i: arr[now_node]){
                if(!visited[i]){
                    visited[i] = true;
                    result[i] = ++visitOrder;
                    queue.add(i);
                }
            }
        }
    }
}
