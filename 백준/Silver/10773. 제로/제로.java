import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int sum;
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        for (int i = 0;  i < k; i++){
            int a = Integer.parseInt(br.readLine());
            if (a == 0){
                stack.pop();
            }
            else {
                stack.push(a);
            }
        }
        for (Integer i : stack) {
            sum += i;
        }
        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}
