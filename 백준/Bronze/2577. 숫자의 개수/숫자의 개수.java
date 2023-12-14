import java.io.*;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int total = a * b * c;
        String result = total + "";

        char[] arr = result.toCharArray();
        int[] num = new int[10];

        for (int i = 0; i < arr.length; i++){
            int digit = arr[i] - '0';
            num[digit]++;
        }

        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
