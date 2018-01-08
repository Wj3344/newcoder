import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = 0;
        while (N != 0) {
            if (N % 2 == 1) {
                num++;
            }
            N /= 2;
        }
        System.out.println(num);
    }
}