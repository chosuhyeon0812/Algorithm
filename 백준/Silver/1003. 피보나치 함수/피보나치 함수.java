import java.io.*;

public class Main {
    static int [][]arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        arr = new int[t+1][2];
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int[] fibo0 = new int[41];
            int[] fibo1 = new int[41];

            fibo0[0] = 1;
            fibo0[1] = 0;
            fibo1[0] = 0;
            fibo1[1] = 1;

            for(int j = 2; j <= k; j++){
                fibo0[j] = fibo0[j-1] + fibo0[j-2];
                fibo1[j] = fibo1[j-1] + fibo1[j-2];
            }
            System.out.println(fibo0[k] + " " + fibo1[k]);
        }
    }
}
