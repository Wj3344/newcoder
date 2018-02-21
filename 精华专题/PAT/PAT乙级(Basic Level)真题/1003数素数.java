import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int temp = 1;
        int sum = 0;
        for (long i = 2; sum < N; i++) {
            if (ISPrime(i)) {
                sum++;
                if (sum >= M) {
                    if (temp < 10 && sum < N) {
                        System.out.print(i + " ");
                    } else {
                        System.out.println(i);
                        temp = 0;
                    }
                    temp++;
                }

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