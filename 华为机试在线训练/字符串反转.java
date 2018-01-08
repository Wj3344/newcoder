import java.util.*;

/**
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。例如：
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer = stringBuffer.reverse();
        System.out.println(stringBuffer.toString());
    }
}