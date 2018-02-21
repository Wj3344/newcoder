import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String message = scanner.nextLine();
            char B = message.split(" ")[1].charAt(0);
            message = message.split(" ")[0];
            getResult(message, B);
        }
    }

    private static void getResult(String a, char b) {
        int temp = 0;
        int B = b - '0';
        int length = a.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            temp = temp * 10 + a.charAt(i) - '0';
            int d = temp / B;
            sb.append(d);
            temp = temp - B * d;
        }
        sb = new StringBuilder(sb.toString().replaceFirst("^0*", ""));
        if (sb.length() == 0) {
            sb.append(0);
        }
        System.out.println(sb.toString() + " " + temp);
    }
}