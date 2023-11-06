import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		
		long N = eucd (Math.max(A,  B), (Math.min(A,  B)));
		
		A = A / N;
		B = B / N;
		
		long M = A * B * N;
		
		System.out.println(M);
	}
	
	static long eucd(long a, long b) {
		if (b == 0){
			return a;
		} else {
			return eucd(b, a%b);
		}
	}
}
