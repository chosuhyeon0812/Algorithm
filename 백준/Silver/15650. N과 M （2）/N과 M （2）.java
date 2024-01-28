import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int n, m;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visited = new boolean[n];
        backtracking(0, 1);

    }
    private static void backtracking(int depth, int start){
        if(depth == m){
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for(int i = start; i <= n; i++){
            if(!visited[i-1]){
                visited[i-1] = true;
                arr[depth] = i;
                backtracking(depth+1, i+1);
                visited[i-1] = false;
            }
        }
    }
}
