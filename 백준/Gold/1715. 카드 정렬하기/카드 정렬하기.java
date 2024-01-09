
import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static int sum;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            pq.add(sc.nextLong());
        }

        while (pq.size() > 1){
            long temp = pq.poll();
            long temp2 = pq.poll();

            sum += temp + temp2;
            pq.add(temp + temp2);
        }
        System.out.println(sum);
    }
}
