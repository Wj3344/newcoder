import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuffer sb = new StringBuffer(str);
            sb = sb.reverse();
            long number = 0;
            int length = sb.length();
            for (int i = 0; i < length; i++) {
                int a = sb.charAt(i) - '0';
                //第 k 位的值 x[k] 表示 x[k]×(2^(k+1)-1)
                number += (a * (Math.pow(2, i + 1) - 1));
            }
            System.out.println(number);
        }
        scanner.close();
    }
}