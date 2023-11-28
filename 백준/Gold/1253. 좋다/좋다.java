import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[num];

        // 배열에 값들 저장하기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 혹시 모를 미여느이 방지를 위해 오름차순 정렬
        Arrays.sort(arr);

        // 순회하면서 포인터의 합이 k와 동일하면선 카운터 +1
        for (int k = 0; k < num; k++) {

            int find = arr[k];
            int i = 0;
            int j  = num -1;

            while (i < j) {
                int sum = arr[i] + arr[j];
//                System.out.println(sum);
                if (sum == find) {
                    if (i != k && j != k) {
                        result++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else {
                        j--;
                    }

                }
                else if (sum > find) {
                    j--;
                } else  {
                    i++;
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}
