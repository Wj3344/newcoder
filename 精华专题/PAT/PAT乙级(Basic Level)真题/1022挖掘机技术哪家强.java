import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        int maxFlag = 0;
        int max = 0;
        int N = scanner.nextInt();
        int[] array = new int[100001];

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            int score = scanner.nextInt();
            array[num] += score;
            if (array[num] > max) {
                max = array[num];
                maxFlag = num;
            }
        }
        System.out.println(maxFlag + " " + max);

    }
}