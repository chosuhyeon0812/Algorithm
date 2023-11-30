import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int N = sc.nextInt();

        // 1번 부터 입력 받은 곳까지 LinkedList에 저장하기
        for (int i = 1; i <=N; i++) {
            q.add(i);
        }
        while (q.size() > 1) {
            q.poll();
            q.add(q.poll());
        }
        System.out.println(q.poll());
    }
}
