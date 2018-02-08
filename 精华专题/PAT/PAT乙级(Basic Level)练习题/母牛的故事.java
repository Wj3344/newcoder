import java.util.Scanner;

public class Main {

    static long[] array = new long[56];

    static {
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        for (int i = 5; i < 56; i++) {
            array[i] = array[i - 1] + array[i - 3];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int year = scanner.nextInt();
            System.out.println(array[year]);
        }
    }
}