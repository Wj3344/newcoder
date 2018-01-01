import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        int num = scanner.nextInt();
        while (num != 0) {
            int temp = num % 10;
            if (!check(temp, stringBuffer)) {
                stringBuffer.append(temp);
            }
            num /= 10;
        }
        System.out.println(stringBuffer.toString());
    }

    public static boolean check(int num, StringBuffer stringBuffer) {
        boolean flag = false;
        int len = stringBuffer.length();
        for (int i = 0; i < len; i++) {
            int temp = stringBuffer.charAt(i) - '0';
            if (temp == num) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}