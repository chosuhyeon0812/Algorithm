import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
     int turn = Integer.parseInt(br.readLine());
     Queue<Integer> q = new LinkedList<>();

     for (int i = 0; i < turn; i++) {
         StringTokenizer st = new StringTokenizer(br.readLine());
         String input = st.nextToken();
         if (input.equals("push")) {
             int num = Integer.parseInt(st.nextToken());
             q.add(num);
         } else if (input.equals("pop")) {
             if (!q.isEmpty()) {
                 System.out.println(q.poll());
             } else {
                 System.out.println(-1);
             }
         } else if (input.equals("size")) {
             System.out.println(q.size());
         } else if (input.equals("empty")) {
             if (!q.isEmpty()){
                 System.out.println(0);
             } else{
                 System.out.println(1);
             }
         } else if (input.equals("front")) {
             if (!q.isEmpty()) {
                 System.out.println(q.peek());
             } else {
                 System.out.println(-1);
             }
         } else {
             if (!q.isEmpty()) {
                 int lastElement = 0;
                 for (int element : q) {
                     lastElement = element;
                 }
                 System.out.println(lastElement);
             } else {
                 System.out.println(-1);
             }
         }

       }
    }
}
