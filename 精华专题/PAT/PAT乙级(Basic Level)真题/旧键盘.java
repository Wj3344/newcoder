import java.util.Scanner;

import static jdk.nashorn.internal.parser.TokenType.IF;

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
        while (scanner.hasNext()) {
            String line1 = scanner.nextLine().toUpperCase();
            String line2 = scanner.nextLine().toUpperCase();
            String result = "";
            int length1 = line1.length();
            int length2 = line2.length();
            for (int i = 0, j = 0; i < length1; i++) {
                char temp1 = line1.charAt(i);
                char temp2 = 0;
                if (j < length2) {
                    temp2 = line2.charAt(j);
                }

                if (temp1 == temp2) {
                    j++;
                    continue;
                }
                if (!result.contains(temp1 + "")) {
                    result += temp1;
                }
            }
            System.out.println(result);
        }
    }
}