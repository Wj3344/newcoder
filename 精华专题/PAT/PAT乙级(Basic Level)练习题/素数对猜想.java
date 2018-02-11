import java.util.Scanner;

public class Main {

    private static int[] array = new int[10000];

    static {
        for (int i = 0, j = 0; i <= 100000; i++) {
            if (ISPrime(i)) {
                array[j++] = i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int num = 0;
            for (int i = 1; i < 10000 && array[i] <= N; i++) {
                if (array[i] - array[i - 1] == 2) {
                    num++;
                }
            }
            System.out.println(num);
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