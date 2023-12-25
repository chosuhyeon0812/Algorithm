import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String word = br.readLine();
            int l = word.length();
            boolean p2 = true;

            if(word.equals("0")){
                break;
            }

            for (int i = 0; i <= l/2; i++){
                if(word.charAt(i) != word.charAt(l-i-1)) p2 = false;
            }

            if (p2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            bw.flush();
        }
            bw.close();
    }
}
