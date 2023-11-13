import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken()); 
		
		int [] arr = new int[N+M];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		st = new StringTokenizer(br.readLine());
		
		for (int j = 0; j < M; j++) {
			arr[N+j] = Integer.parseInt(st.nextToken());
		}
		
		
		// 정렬
		Arrays.sort(arr);
		
		// 결과

		StringBuilder sb = new StringBuilder();
		
		for(int r : arr) {
			sb.append(r+" "); 
		
		}
		System.out.println(sb);
	}
}
