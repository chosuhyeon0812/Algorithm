
import java.io.*;
import java.util.StringTokenizer;

public class Main {

   static int m, n, k;
   static int[][] cabbage;
   static boolean[][] visited;
   static int count;
   static int[] dx = {0, -1, 0, 1};
   static int[] dy = {1, 0, -1, 0};

   private static void dfs(int x, int y) {
       visited[x][y] = true;

       for(int i  = 0; i < 4; i++){
           int di  = x + dx[i];
           int dj = y + dy[i];

           if(0 <= di && 0 <= dj && di < m && dj < n){
               if(!visited[di][dj] && cabbage[di][dj] == 1){
                   dfs(di, dj);
               }
           }
       }
   }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i  = 0; i < t; i++){
            count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            cabbage = new int[m][n];
            visited = new boolean[m][n];

            for(int j = 0; j < k; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                cabbage[x][y] = 1;
            }

            for(int x = 0; x < m; x++){
                for(int y = 0; y < n; y++){
                    if(cabbage[x][y] == 1 && !visited[x][y]){
                        dfs(x, y);
                        count++;
                    }
                }
            }
            System.out.println(count);

        }
    }
}
