import java.util.Scanner;

public class Main {
    static char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            StringBuffer sb = new StringBuffer();
            int num = scanner.nextInt();
            int R = scanner.nextInt();
            while (num > 0) {
                sb.append(number[num % R]);
                num = num / R;
            }
            int len = sb.length();
            num = 0;
            for (int i = 0; i < len; i++) {
                if('1' == sb.charAt(i)){
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}