import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();

		
		for (int i = 0; i < testcase; i++) {
			String test = sc.next();
			String[] test1 = test.split("");
			int score = 0;
			int bonus = 0;
	
			for (int j = 0; j < test1.length; j++) {
				if (test1[j].equals("O")) {
					bonus += 1;
					score += bonus;
					
				} else {
					bonus = 0;
				}
			}
			System.out.println(score);
		}
	}
}