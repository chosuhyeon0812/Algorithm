import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] arr;
    static boolean visited[];
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new ArrayList[N+1];
        visited = new boolean[N+1];

        // 인접 리스트 초기화
        for (int i = 1; i < N+1; i++){
            arr[i] = new ArrayList<Integer>();
        }

        // 인접 리스트 입력 받기
        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            // 양방향 엣지로 양쪽에 엣지 더해주기
            arr[s].add(e);
            arr[e].add(s);
        }
        br.close();

        for (int i = 1; i < N+1; i++){
            if (!visited[i]){
                count++;
                DFS(i);
            }
        }
        bw.write(count + "");
        bw.flush();
    }

    static void DFS(int v) {
        visited[v] = true;
        for (int i : arr[v]){
            if (!visited[i]){
                DFS(i);
            }
        }
    }
}
