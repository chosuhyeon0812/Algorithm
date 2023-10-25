import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][4];
		
		int score = 0;
		int max = 0;
		int idx = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				score += arr[i][j];
			}
			
			if (max < score) {
				max = score;
				idx = i + 1;
			}
			score = 0;
		}
		System.out.println(idx + " " + max);
		sc.close();
		
	}
}
