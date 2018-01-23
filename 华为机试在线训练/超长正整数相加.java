import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String addend = scanner.next();
            String augend = scanner.next();
            System.out.println(getResult(addend, augend));
        }
    }

    public static String getResult(String addend, String augend) {
        StringBuffer sb = new StringBuffer();
        int length1 = addend.length();
        int length2 = augend.length();
        int temp = 0;
        if (length1 < length2) {
            //2比1长
            String tempStr = augend;
            augend = addend;
            addend = tempStr;
            temp = length2;
            length2 = length1;
            length1 = temp;
            temp = 0;

        }
        for (int i = length2 - 1, j = length1 - 1; i >= 0 && j >= 0; i--, j--) {
            int a = addend.charAt(j) - '0';
            int b = augend.charAt(i) - '0';
            temp += a + b;
            sb.insert(0, temp % 10);
            temp /= 10;
        }
        if (length1 != length2) {
            for (int i = length1 - length2 - 1; i >= 0; i--) {
                temp += addend.charAt(i) - '0';
                sb.insert(0, temp % 10);
                temp /= 10;
            }
        }
        if (temp > 0) {
            sb.insert(0, temp);
        }
        return sb.toString();
    }
}