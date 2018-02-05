import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while (scanner.hasNext()) {
            //第一个参数
            int num = scanner.nextInt();
            if (num != 0) {
                //接受第二个参数
                int two = scanner.nextInt();
                if (two == 0) {
                    break;
                } else {
                    sb.append((num * two) + " " + (two - 1) + " ");
                }
            } else if (num == 0) {
                break;
            }
        }
        if (sb.length() == 0) {
            sb.append("0 0");
        } else {
            sb.deleteCharAt(sb.length() - 1);
        }
        System.out.println(sb.toString());
    }
}