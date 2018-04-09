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
            //清除空格
            message = message.replaceAll(" ", "");
            int length = message.length();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < length; i++) {
                if (i == 6 || i == 14) {
                    if (i < length){
                        stringBuffer.append(" ");
                    }
                }
                stringBuffer.append(message.charAt(i));
            }
            System.out.println(stringBuffer.toString());
        }
        scan.close();
    }
}