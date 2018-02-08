import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            //处理整数部分
            int res = a / b;
            sb.append(res + ".");
            a = a - b * res;
            //小数部分
            for (int i = 0; i < n; i++) {
                a = a * 10;
                res = a / b;
                sb.append(res);
                a = a - b * res;
            }
            System.out.println(sb.toString());
            sb.delete(0, sb.length());
        }
    }
}