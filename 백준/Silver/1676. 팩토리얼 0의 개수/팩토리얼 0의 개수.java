import java.io.*;
import java.util.Scanner;

public class Main {
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        count(n);
        
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
    private static void count(int n){
        while(n >= 5) {
            cnt += n / 5;
            n /= 5;
        }
    }
}
