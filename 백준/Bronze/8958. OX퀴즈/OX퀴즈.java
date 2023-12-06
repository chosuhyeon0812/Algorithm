import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String arr [] = new String[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			int score = 0;
			int sum = 0;
			
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					score++;
				} else {
					score = 0;
				}
				sum += score;
			}
			System.out.println(sum);
		}
	}
}
