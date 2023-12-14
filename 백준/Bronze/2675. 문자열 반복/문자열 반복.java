import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine());
            int turn = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            char[] arr = word.toCharArray();
            for (int j = 0; j < arr.length; j++){
                String word2 = String.valueOf(arr[j]).repeat(turn);
                sb.append(word2);
            }
            sb.append("\n");
        }
            System.out.println(sb);
    }
}
