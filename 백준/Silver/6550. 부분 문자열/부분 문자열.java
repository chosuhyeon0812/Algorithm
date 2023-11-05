import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            String s = st.nextToken();
            String t = st.nextToken();
            
            int s_idx = 0;
            int t_idx = 0;
            boolean isSubsequence = true;

            while (s_idx < s.length() && t_idx < t.length()) {
                if (s.charAt(s_idx) == t.charAt(t_idx)) {
                    s_idx++;
                }
                t_idx++;
            }

            if (s_idx == s.length()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
