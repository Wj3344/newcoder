import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(jumpFloor(n));
        }
    }

    public static long jumpFloor(int stage) {
        if (stage == 0) {
            return 0;
        } else if (stage == 1) {
            return 1;
        } else if (stage == 2) {
            return 2;
        } else {
            long n1 = 1;
            long n2 = 2;
            long total = 0;
            for (int i = 2; i < stage; i++) {
                total = n1 + n2;
                n1 = n2;
                n2 = total;
            }
            return total;
        }
    }
}