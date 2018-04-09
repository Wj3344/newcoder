import java.util.Scanner;

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
        while (scanner.hasNext()) {
            long number = scanner.nextLong();
            long temp = (long) Math.sqrt(number);
            for (long i = temp; i >= 0; i--) {
                long re = i + i * i;
                if (re <= number) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}