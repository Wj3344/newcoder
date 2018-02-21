import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        boolean flag = true;
        int i = 1;
        if (array[0] != 0) {
            while (array[i] == 0) {
                i++;
            }
            System.out.print(i);
            array[i]--;
        }
        for (i = 0; i < 10; i++) {
            while (array[i]!= 0){
                System.out.print(i);
                array[i]--;
            }
        }
        System.out.println();
    }
}