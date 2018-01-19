import java.util.Scanner;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/1/14
 * Time: 12:21
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int statrt = scanner.nextInt();
        int end = scanner.nextInt();
        int sum = 0;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = statrt; i <= end; i++) {
            if (isShuixianhua(i)) {
                sum++;
                stringBuffer.append(i + " ");
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        if (sum == 0) {
            System.out.println("no");
        } else {
            System.out.println(stringBuffer.toString());
        }
    }

    public static boolean isShuixianhua(int num) {
        boolean flag = false;
        int sum = 0;
        int n = num;
        while (num > 0) {
            int temp = num % 10;
            sum += temp * temp * temp;
            num = num / 10;
        }
        if (sum == n) {
            flag = true;
        }
        return flag;
    }
}