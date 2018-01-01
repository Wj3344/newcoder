import java.util.*;

/**
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，
 * 则逆序形式也含有0，如输入为100，则输出为001
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(num);
        stringBuffer = stringBuffer.reverse();
        System.out.println(stringBuffer.toString());
    }
}