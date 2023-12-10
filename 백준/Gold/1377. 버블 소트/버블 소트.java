import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        HashMap<Integer, Integer> arr2 = new HashMap<>();
        HashMap<Integer, Integer> arr3 = new HashMap<>();

        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            arr2.put(arr[i], i);
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++){
            arr3.put(arr[i], i);
        }

        int max = 0;
        for (int i = 0; i < n; i++){
            if (arr2.get(arr[i]) - arr3.get(arr[i]) > max){
                max = arr2.get(arr[i]) - arr3.get(arr[i]);
            }
        }
        bw.write(max+1 + "\n");
        bw.flush();
        bw.close();

    }
}
