import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        int[] brr = new int[n];

        // 배열 입력받기
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for (int j = 1; j < n; j++){
            int point = 1;
            int value = arr[j];
            for (int z = j-1; z >= 0; z--){
                if (arr[z] < arr[j]){
                    point = z + 1;
                    break;
                }
                if (z == 0){
                    point = 0;
                }
            }
            for (int z = j; z > point; z--){
                arr[z] = arr[z-1];
            }
            arr[point] = value;
        }
        // 합배열 만들기
        brr[0] = arr[0];
        for (int i = 1; i < n; i++){
            brr[i] = brr[i-1] + arr[i];
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += brr[i];
        }
        System.out.println(sum);
    }
}
