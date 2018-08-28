import java.util.Scanner;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 18-1-15
 * Time: 下午9:42
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            getFactor(scanner.nextInt());
        }
    }

    /**
     * 得到num的因数的个数
     *
     * @param num
     */
    public static void getFactor(int num) {
        int n = (int) (Math.sqrt(num) + 0.5);
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (num % i == 0) {
                if (num / i != i) {
                    result += 2;
                } else {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
