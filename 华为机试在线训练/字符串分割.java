import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String temp = sc.nextLine();
            doSome(temp);
        }
    }

    private static void doSome(String str) {
        int len = str.length();
        int num = len / 8;
        if (len % 8 != 0) {
            num++;
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i * 8 + j) >= len) {
                    System.out.print("0");
                } else {
                    System.out.print(str.charAt((i * 8 + j)));
                }
            }
            System.out.println();
        }
    }
}