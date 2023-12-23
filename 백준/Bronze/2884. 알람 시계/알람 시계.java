import java.awt.print.Pageable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int result = 0;
        int result2 = 0;

        if (minute >= 45) {
            result2 = minute - 45;
            result = hour;
        } else {
            if (hour == 0) {
                result = 23;
                result2 = (60 + minute) - 45;
            } else {
                result = hour -1;
                result2 = (60 + minute) - 45;
            }
        }
        System.out.println(result + " " + result2);

    }
}
