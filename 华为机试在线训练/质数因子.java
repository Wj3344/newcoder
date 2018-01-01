import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        findFactors(num);
    }

    public static void findFactors(long number) {
        StringBuffer sb = new StringBuffer();
        long temp = (long) Math.sqrt(number);
        for (int i = 2; i <= temp; i++) {
            while (true) {
                if (number % i == 0) {
                    sb.append(i);
                    number /= i;
                    if (number != 1) {
                        sb.append(" ");
                    }
                } else {
                    break;
                }
            }
        }
        if (number != 1) {
            sb.append(number);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
