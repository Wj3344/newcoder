import java.util.Scanner;

public class Main {
    static long[] array = new long[100001];
    static {
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i <= 100000; i++) {
            array[i] = (array[i - 1] + array[i - 2]) % 1000000;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int day = scanner.nextInt();
            System.out.printf((day < 25 ? "%d\n" : "%06d\n"), array[day]);
        }
    }
}