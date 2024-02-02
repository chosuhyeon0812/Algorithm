import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, m;
    static int[] arr;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        result = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i  = 0; i < n; i++){
            result[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(result);
        backtracking(0);
        bw.flush();
        bw.close();
    }
    private static void backtracking(int depth) throws IOException {
        if(depth == m){
            for (int i : arr) {
                bw.write(i + " ");
            }
            bw.write("\n");
            return;
        }
        for(int i = 0; i < n; i++){
            arr[depth] = result[i];
            backtracking(depth+1);
        }
    }
}
