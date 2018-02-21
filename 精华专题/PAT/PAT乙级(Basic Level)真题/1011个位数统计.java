import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int[] array = new int[10];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            c -= '0';
            array[c]++;
        }
        for (int i = 0; i < 10; i++) {
            if (array[i] > 0) {
                System.out.println(i + ":" + array[i]);
            }
        }
    }
}