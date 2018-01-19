import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ids = new int[1025];
        int ID1 = scanner.nextInt();
        int ID2 = scanner.nextInt();
        if (ID1 > 1024 || ID1 < 1 || ID2 > 1024 || ID2 < 1) {
            System.out.println(-1);
        } else {
            ids[ID1] = 1;
            if (ids[ID2] == 1) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}