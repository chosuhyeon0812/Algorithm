import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int rank = 1;
		int [][] score = new int[N+1][4];
		for (int i = 1; i < N+1; i++) {
			st = new StringTokenizer(br.readLine());
			int country = Integer.parseInt(st.nextToken());
			int gold = Integer.parseInt(st.nextToken());
			int silver = Integer.parseInt(st.nextToken());
			int dong = Integer.parseInt(st.nextToken());
			score[country][0] = gold;
			score[country][1] = silver;
			score[country][2] = dong;
		}
		
		for (int i = 1; i <= N; i++) {
			if (score[i][0] > score[K][0]) {
				rank++;
			} else if (score[i][0] == score[K][0] && score[i][1] > score[K][1]) {
				rank++;
			} else if (score[i][0] == score[K][0] && score[i][1] == score[K][1] && score[i][2] > score[K][2]) {
				rank++;
			}
		}
		System.out.println(rank);
		bw.flush();
		bw.close();
		br.close();
	}
}
