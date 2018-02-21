import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        int D = scanner.nextInt();
        A += B;
        B = A / D;
        StringBuilder stringBuilder = new StringBuilder();
        while (A != 0) {
            stringBuilder.append(A % D);
            A = A / D;
        }
        stringBuilder = stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
    }
}