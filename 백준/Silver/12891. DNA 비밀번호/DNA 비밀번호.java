import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int s;
    static int p;
    static char[] str;
    static int[] checkArr = new int[4];
    static int[] myArr = new int[4];
    static int checkCnt = 0; // {‘A’, ‘C’, ‘G’, ‘T’} 중 최소 개수를 일치한 문자 개수 (0~4)
    static int answer = 0; // 만들 수 있는 비밀번호 개수

    public static boolean checkCounting() {
        for (int i = 0; i < 4; i++) {
            if (myArr[i] < checkArr[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        s = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        str = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < p; i++) {
            if (str[i]=='A') myArr[0]++;
            if (str[i]=='C') myArr[1]++;
            if (str[i]=='G') myArr[2]++;
            if (str[i]=='T') myArr[3]++;
        }

        if (checkCounting())
            answer++;

        int i = -1;

        for (int j = p; j < s; j++) {
            i = j - p;

            // 시작 문자 제외
            if (str[i]=='A') myArr[0]--;
            if (str[i]=='C') myArr[1]--;
            if (str[i]=='G') myArr[2]--;
            if (str[i]=='T') myArr[3]--;

            // 끝에서 1문자 추가
            if (str[j]=='A') myArr[0]++;
            if (str[j]=='C') myArr[1]++;
            if (str[j]=='G') myArr[2]++;
            if (str[j]=='T') myArr[3]++;

            if (checkCounting())
                answer++;
        }
        System.out.println(answer);
    }
}
