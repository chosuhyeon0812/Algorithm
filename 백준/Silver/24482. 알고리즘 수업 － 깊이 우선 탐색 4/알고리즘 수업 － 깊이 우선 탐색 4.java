import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int depth;
    static int[] checked;
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        checked = new int[n+1];
        arr = new ArrayList[n+1];

        for (int i = 1; i <=n; i++){
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
            Collections.sort(arr[i], Collections.reverseOrder());
        }

        Arrays.fill(checked, -1);
        dfs(start, depth);

        for (int i = 1; i < checked.length; i++){
            System.out.println(checked[i]);
        }
    }

    private static void dfs(int node, int d){
        checked[node] = d;
        for (int i : arr[node]){
            if (checked[i] == -1){
                dfs(i, d+1);
            }
        }
    }
}
