import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int turn = sc.nextInt();
		String nums = sc.next();
		
		char[] arr = nums.toCharArray();
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			// '0'을 빼서 해당 문자가 나타내는 숫자 얻기
			sum += arr[i] - '0';
		}
//		System.out.println(arr);
		System.out.println(sum);
	}
}


