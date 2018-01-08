import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            int[] array = new int[1001];
            for (int i = 0; i < N; i++) {
                int temp = sc.nextInt();
                array[temp] = 1;
            }
            for (int i = 0; i < 1001; i++) {
                if (array[i] != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}