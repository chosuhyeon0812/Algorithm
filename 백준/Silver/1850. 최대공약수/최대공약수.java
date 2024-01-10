import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static long result;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = sc.nextLong();
        long b = sc.nextLong();

        if (b > a){
            long temp = b;
            b = a;
            a = temp;
        }

        result = gcd(a, b);
        while(result > 0){
            bw.write("1");
            result--;
        }
        bw.flush();
        bw.close();
    }

    private static long gcd(long x, long y) {
        if (y == 0){
            return x;
        } else {
           return gcd(y, x % y);
        }
    }
}
