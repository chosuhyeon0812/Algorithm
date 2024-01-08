import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            String bracket = scanner.nextLine();
            String result = checkBrackets(bracket);
            System.out.println(result);
        }
    }

    public static String checkBrackets(String text) {
        Stack<Character> stack = new Stack<>();

        for (char ch : text.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return "NO";
                    }
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}
