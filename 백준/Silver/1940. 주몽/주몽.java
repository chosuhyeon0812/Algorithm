import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int [] arr = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length && st.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        // 포인터, 결과 변수 생성
        int i = 0;
        int j = N-1;
        int count = 0;
        int sum = 0;

        // 순회하면서 포인터의 합이 M과 같다면 count++
        while (i < j) {
            sum = arr[i] + arr[j];
            if (sum > M) {
                j--;
            } else if (sum < M){
                i++;
            } else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
