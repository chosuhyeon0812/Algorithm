import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int guest = Integer.parseInt(st.nextToken());
			
			String result;
			
			if (guest % h == 0) {
				result = String.valueOf(h);
				result += String.format("%02d", (guest/h));
			} else {
				result = String.valueOf(guest % h);
				result += String.format("%02d", (guest / h) + 1);
			}
			System.out.println(result);
		}
		
		
		br.close();
	}
}
