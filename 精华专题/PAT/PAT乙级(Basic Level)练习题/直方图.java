import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int[] array = new int[10];
            String message = scanner.nextLine();
            int length = message.length();
            int maxHeight = 0;
            for (int i = 0; i < length; i++) {
                int c = message.charAt(i) - '0';
                array[c]++;
                if (array[c] > maxHeight) {
                    maxHeight = array[c];
                }
            }
            length = maxHeight;
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < 10; j++) {
                    if (array[j] >= maxHeight) {
                        System.out.print("*");
                        array[j]--;
                    } else {
                        System.out.print(" ");
                    }
                }
                maxHeight--;
                System.out.println();
            }
            for (int i = 0; i < 10; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}