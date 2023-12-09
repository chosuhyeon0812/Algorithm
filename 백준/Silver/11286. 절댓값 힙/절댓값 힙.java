import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// 우선순위 큐 선언(절댓값 기준으로 정렬되도록 설정하기, 같으면 음수 먼저 정렬)
		PriorityQueue<Integer> q = new PriorityQueue<>((q1, q2) -> {
			int first_abs = Math.abs(q1);
			int second_abs = Math.abs(q2);
			if (first_abs == second_abs)
				return q1 > q2 ? 1: -1;
			else 
				return first_abs - second_abs;
		});
		
		// for 문 순회
		for (int i = 0; i < n; i++) {
			int request = Integer.parseInt(br.readLine());
			// 압력값이 0일땨,,, 큐가 비어있으면 0, 비어있지않으면 큐의 front 값 출력(poll)
			if (request == 0) {
				if (q.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(q.poll());
				}
				// 입력값이 1일때,,, 새로운 데이터를 우선순위 큐에 더하기(add)
			} else {
				q.add(request);
			}
		}
	}
}
