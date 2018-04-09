import java.util.Scanner;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/2/26
 * Time: 16:09
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String message = scan.nextLine();
            String[] array = message.split("\\.");
            if (array.length > 1) {
                System.out.println(array[array.length - 1]);
            } else {
                System.out.println("null");
            }
        }
        scan.close();
    }
}