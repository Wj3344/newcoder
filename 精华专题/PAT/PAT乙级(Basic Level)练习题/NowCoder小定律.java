import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            if (from == 0 && to == 0) {
                break;
            }
            boolean flag = true;
            for (int i = from; i <= to; i++) {
                if (!ISPrime((i * i + i + 41))) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("OK");
            } else {
                System.out.println("Sorry");
            }
        }
    }

    public static boolean ISPrime(long n) {
        if (n <= 3) {
            return n > 1;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int k = (int) Math.sqrt(n) + 1;
        for (int i = 5; i < k; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}