import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    public static class computer{
        int idx;
        ArrayList<computer> list;
        public computer(int idx) {
            this.idx = idx;
            list = new ArrayList<>();
        }
    }
    static int n, m;
    static computer[] corns;
    static boolean[] visited;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        corns = new computer[n+1];
        answer = new int[n+1];

        for(int i = 0; i <= n; i++){
            corns[i] = new computer(i);
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            corns[e].list.add(corns[s]);
        }

        for(int i = 1; i <= n; i++){
            visited = new boolean[n+1];
            visited[i] = true;

            dfs(i, i);
        }
        int max = 0;
        for(int i = 1; i <= n; i++){
            max = Math.max(max, answer[i]);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++){
            if(answer[i] == max) {
                sb.append(i + " ");
            }
        }
        System.out.println(sb.toString());
    }
    public static void dfs(int original, int now){
        for(computer c : corns[now].list){
            if(!visited[c.idx]){
                visited[c.idx] = true;
                dfs(original, c.idx);
                answer[original]++;
            }
        }
    }


}
