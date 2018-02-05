import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while (scanner.hasNext()) {
            String message = scanner.nextLine();
            String[] array = message.split(" ");
            int size = array.length - 1;
            for (int i = size; i > 0;i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println(array[0]);
        }
    }
}