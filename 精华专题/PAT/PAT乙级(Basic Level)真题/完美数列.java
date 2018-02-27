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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int p = scanner.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int maxLength = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + maxLength; j < N; j++) {
                if (array[j] > array[i] * p) {
                    break;
                }
                maxLength++;
            }
        }
        System.out.println(maxLength);
    }
}