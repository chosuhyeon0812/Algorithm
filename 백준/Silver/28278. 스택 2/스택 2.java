import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int commend = Integer.parseInt(st.nextToken());
            if (commend == 1) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            } else if (commend == 2) {
                if(!stack.isEmpty()) {
                    bw.write(stack.pop() + "\n");
                } else {
                    bw.write(-1 + "\n");
                }
            } else if (commend == 3) {
                bw.write(stack.size() + "\n");
            } else if (commend == 4) {
                if (stack.empty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else {
                if (!stack.isEmpty()) {
                    bw.write(stack.peek() + "\n");
                } else {
                    bw.write(-1 + "\n");
                }
            }
        }
        bw.flush();
    }
}
