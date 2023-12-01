import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int [] arr = new int [9];
		// 최댓값 구하기
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 최댓값 찾기
		int turn = 0;
		for (int i = 0; i < 9; i++) {
			if (arr[i] > num) {
				num = arr[i];
				turn = i+1;
			}
		}
		System.out.println(num);
		System.out.println(turn);
	}
}
