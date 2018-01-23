import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (check(str.charAt(i))) {
                int end = i;
                int start = end;
                while (i >= 0 && check(str.charAt(i))) {
                    start = i;
                    i--;
                }
                for (int j = start; j <= end; j++) {
                    stringBuffer.append(str.charAt(j));
                }
                stringBuffer.append(" ");

            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        System.out.println(stringBuffer.toString());
    }

    public static boolean check(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}