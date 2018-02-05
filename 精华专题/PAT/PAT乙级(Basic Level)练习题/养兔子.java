import java.util.Scanner;

/**
 * 就是斐波那契数列
 * 把 array[0] = 1，补上就有
 * array[0] = 1
 * array[1] = 1;
 * array[2] = 2;
 * array[i] = array[i - 1] + array[i - 2];
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int day = scanner.nextInt();
            long[] array = new long[91];
            array[1] = 1;
            array[2] = 2;
            for (int i = 3; i <= day; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            System.out.println(array[day]);
        }
    }
}