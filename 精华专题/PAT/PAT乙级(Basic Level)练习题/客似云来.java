import java.util.Scanner;

public class Main {
    static long[] array = new long[81];

    static {
        array[1] = 1;
        array[2] = 1;
        for (int i = 3; i <= 80; i++) {
            array[i] = (array[i - 1] + array[i - 2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            long result = 0;
            for (int i = start; i <= end; i++) {
                result += array[i];
            }
            System.out.println(result);
        }
    }
}