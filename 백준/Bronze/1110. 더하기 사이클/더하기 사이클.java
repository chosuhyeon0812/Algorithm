import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int target = num;
		int count = 0;
		
		sc.close();
		
		while (true) {
			int a = target / 10;
			int b = target % 10;
			
			target = b * 10 + (a+b) % 10;
			count+=1;
			if (num == target) {
				break;
			}
		}
		System.out.println(count);
		
	}
		
}

