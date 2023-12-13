import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];

        // 좌표 입력받기
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i][0] = x;
            arr[i][1] = y;
        }

        Arrays.sort(arr, (o1, o2)-> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            else {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < n; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
