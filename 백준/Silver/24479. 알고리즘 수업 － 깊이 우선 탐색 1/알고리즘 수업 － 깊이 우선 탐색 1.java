import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static boolean visited[];
    static ArrayList<Integer>[] arr;
    static int[] checked;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        checked = new int[n+1];

        arr = new ArrayList[n+1];
        for (int i = 1; i <= n; i++){
            arr[i] = new ArrayList<Integer>();
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

        cnt = 1;
        visited = new boolean[n+1];
        dfs(start);

        for (int i = 1; i < checked.length; i++){
            sb.append(checked[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int node){
        checked[node] = cnt;

        visited[node] = true;
        for (int i : arr[node]){
            if (!visited[i]){
                cnt++;
                dfs(i);
            }
        }
    }
}
