import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] arr;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        backtracking(0, 1);
        bw.flush();
        bw.close();
    }

    private static void backtracking(int depth, int start) throws IOException {
        if(depth == m){
            for (int i : arr) {
                bw.write(i + " ");
            }
            bw.write("\n");
            return;
        }
        for(int i = start; i <= n; i++){
            arr[depth] = i;
            backtracking(depth+1, i);

        }
    }
}
