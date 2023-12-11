import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];

     st = new StringTokenizer(br.readLine());
     for (int i = 0; i < n; i++){
         arr[i] = Integer.parseInt(st.nextToken());
     }
     Arrays.sort(arr);

     StringBuilder sb = new StringBuilder();

     st = new StringTokenizer(br.readLine());
     int m = Integer.parseInt(st.nextToken());

     st = new StringTokenizer(br.readLine());
     for (int i = 0; i < m; i++) {
         int num = Integer.parseInt(st.nextToken());

         int in = Arrays.binarySearch(arr, num);

         if (in < 0){
             sb.append(0 + "\n");
         } else {
             sb.append(1 + "\n");
         }

     }
        System.out.println(sb);
    }
}
