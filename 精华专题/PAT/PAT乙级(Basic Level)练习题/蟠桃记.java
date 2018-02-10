import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int day = scanner.nextInt();
            System.out.println(getResult(day));
        }
    }

    public static int getResult(int day) {
        if (day == 1) {
            return 1;
        } else {
            return (getResult(day - 1) + 1) * 2;
        }
    }
}