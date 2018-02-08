import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String message = sc.nextLine();
            int length = message.length();
            for (int i = 0; i < length; i++) {
                char c = message.charAt(i);
                if (c >= 'A' && c <= 'E') {
                    System.out.printf("%c", c + 21);
                } else if (c >= 'F' && c <= 'Z') {
                    System.out.printf("%c", c - 5);
                } else {
                    System.out.printf("%c", c);
                }
            }
            System.out.println();
        }
    }
}