import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int result = 0;

            while (n > 1) {
                n = n / 3 + 1 - (n % 3 ^ 3) / 3;
                result++;
            }
            System.out.println(result);
        }
    }
}