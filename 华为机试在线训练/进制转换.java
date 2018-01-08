import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String temp = sc.nextLine().toUpperCase();
            String[] array = temp.split("0X");
            for (int i = 1; i < array.length; i++) {
                doSome(array[i]);
            }
        }
    }

    private static void doSome(String str) {
        int num = 0;
        int len = str.length();
        str = str.toUpperCase();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            num = num * 16;
            if (c == 'A') {
                num = num + 10;
            } else if (c == 'B') {
                num = num + 11;
            } else if (c == 'C') {
                num = num + 12;
            } else if (c == 'D') {
                num = num + 13;
            } else if (c == 'E') {
                num = num + 14;
            } else if (c == 'F') {
                num = num+ 15;
            } else {
                num +=Integer.parseInt(c + "");
            }
        }
        System.out.println(num);
    }
}