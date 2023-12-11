import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char[] arr = word.toCharArray();
//        System.out.println(arr);
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1; j++){
                if (Integer.parseInt(String.valueOf(arr[j])) < Integer.parseInt(String.valueOf(arr[j+1]))){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        String new_word = String.valueOf(arr);
        System.out.println(new_word);
    }
}
