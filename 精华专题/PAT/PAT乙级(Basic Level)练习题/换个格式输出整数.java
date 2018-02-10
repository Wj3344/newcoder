import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            int bai = number / 100;
            int shi = (number - bai * 100) / 10;
            int ge = number % 10;
            for (int i = 0; i < bai; i++) {
                System.out.print("B");
            }
            for (int i = 0; i < shi; i++) {
                System.out.print("S");
            }
            for (int i = 1; i <= ge; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}