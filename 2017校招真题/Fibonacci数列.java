import java.util.Scanner;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/4/13
 * Time: 19:09
 * Description:
 */
public class Main {
    static long[] array = new long[93];

    static {
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= 92; i++) {
            array[i] = (array[i - 1] + array[i - 2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int index = 0;
            for (int i = 1; i < 92; i++) {
                if (N <= array[i] && array[i - 1] <= N) {
                    index = i;
                    break;
                }
            }
            long min = Math.min((array[index] - N), (N - array[index - 1]));
            System.out.println(min);
        }

    }
}