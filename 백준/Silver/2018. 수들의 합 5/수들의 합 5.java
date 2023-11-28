import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력받기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 투 포인터 초기화
		int start_index = 1;
		int end_index = 1;
		
		// 합 변수 선언
		int sum = 1;
		
		// 총 개수
		int count = 1;
		
		while (end_index != n) {
			if (sum == n) {
				count++;
				end_index++;
				sum += end_index;
			} else if (sum > n) {
				sum -= start_index;
				start_index++;
			} else {
				end_index++;
				sum += end_index;
			}
		}
		System.out.println(count);
	}
}
