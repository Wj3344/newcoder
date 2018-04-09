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
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String message = scan.nextLine();
            String[] array = message.split(" ");
            if (!check(array[0]) || !check(array[1])) {
                System.out.println("error");
            } else {
                System.out.println(getResult(array[0], array[1]));
            }
        }
        scan.close();
    }

    public static boolean check(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }

    /**
     * 用字符串模拟两个大数相加
     *
     * @param addend 加数1
     * @param augend 加数2
     * @return 相加结果
     */
    public static String getResult(String addend, String augend) {
        StringBuffer sb = new StringBuffer();
        int length1 = addend.length();
        int length2 = augend.length();
        int temp = 0;
        if (length1 < length2) {
            //2比1长
            String tempStr = augend;
            augend = addend;
            addend = tempStr;
            temp = length2;
            length2 = length1;
            length1 = temp;
            temp = 0;

        }
        for (int i = length2 - 1, j = length1 - 1; i >= 0 && j >= 0; i--, j--) {
            int a = addend.charAt(j) - '0';
            int b = augend.charAt(i) - '0';
            temp += a + b;
            sb.insert(0, temp % 10);
            temp /= 10;
        }
        if (length1 != length2) {
            for (int i = length1 - length2 - 1; i >= 0; i--) {
                temp += addend.charAt(i) - '0';
                sb.insert(0, temp % 10);
                temp /= 10;
            }
        }
        if (temp > 0) {
            sb.insert(0, temp);
        }
        return sb.toString();
    }

}