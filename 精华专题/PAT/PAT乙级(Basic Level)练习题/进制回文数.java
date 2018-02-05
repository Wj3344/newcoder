import java.util.Scanner;

public class Main {
    static char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            StringBuffer sb = new StringBuffer();
            int NUMBER = scanner.nextInt();
            boolean flag = false;
            for (int i = 2; i < 17; i++) {
                int num = NUMBER;
                while (num > 0) {
                    sb.append(number[num % i]);
                    num = num / i;
                }
                if (check(sb.toString())) {
                    System.out.println("Yes");
                    flag = true;
                    break;
                }
                sb.delete(0, sb.length());
            }
            if (!flag) {
                System.out.println("No");
            }

        }
    }

    /**
     * 判断是不是回文字符串
     * @param text
     * @return
     */
    public static boolean check(String text) {
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.toCharArray()[i] != text.toCharArray()[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}