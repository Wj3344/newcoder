
import java.util.*;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/8/14
 * Time: 12:29
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long M = scanner.nextLong();
            long count = 0;
            for (long j = 2; j <= Math.sqrt(M); j++) {
                while (M % j == 0) {
                    M = M / j;
                    count++;
                }
                if (M <= 1) break;
            }
            if (M > 1) count++;
            System.out.println(count);
        }
    }
}