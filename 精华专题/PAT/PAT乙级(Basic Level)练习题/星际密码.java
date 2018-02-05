import java.util.Scanner;

public class Main {
    static long[] array = new long[10001];

    static {
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i < 10001; i++) {
            array[i] = (array[i - 1] + array[i - 2]) % 10000;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            for (int i = 0; i < N; i++) {
                int num = scanner.nextInt();
                System.out.printf("%04d", array[num]);
            }
            System.out.println();
        }
    }
}