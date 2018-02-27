import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static jdk.nashorn.internal.parser.TokenType.IF;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/2/26
 * Time: 16:09
 * Description:
 */
public class Main {
    private static char[] arrays = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
    private static int[] quanzhong = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.next();
        }
        int num = 0;
        for (int i = 0; i < N; i++) {
            if (doIt(array[i])) {
                num++;
            } else {
                System.out.println(array[i]);
            }
        }
        if (num == N) {
            System.out.println("All passed");
        }

    }

    private static boolean doIt(String array) {
        int length = array.length();
        int result = 0;
        for (int i = 0; i < length - 1; i++) {
            int temp = array.charAt(i) - '0';
            result += temp * quanzhong[i];
        }
        char temp = array.charAt(length - 1);
        char re = arrays[result % 11];
        if (temp == re) {
            return true;
        } else {
            return false;
        }
    }
}