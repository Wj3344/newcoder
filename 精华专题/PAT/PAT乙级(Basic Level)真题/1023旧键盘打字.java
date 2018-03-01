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
        //将大写转换成小写
        String result = scanner.nextLine().toLowerCase();
        String message = scanner.nextLine();
        //处理result
        StringBuilder sb = new StringBuilder();
        int length = result.length();
        for (int i = 0; i < length; i++) {
            char temp = result.charAt(i);
            sb.append((char) temp);
            if (temp >= 'A' && temp <= 'Z') {
                sb.append((char) (temp + 32));
            } else if (temp >= 'a' && temp <= 'z') {
                sb.append((char) (temp - 32));
            }
        }
        //是否含有上档键
        if (result.contains("+")) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }
        result = sb.toString();
        //线程安全
        sb.delete(0, sb.length());
        length = message.length();
        for (int i = 0; i < length; i++) {
            char temp = message.charAt(i);
            if (!result.contains(temp + "")) {
                sb.append(temp);
            }
        }
        System.out.println(sb.toString());
    }
}