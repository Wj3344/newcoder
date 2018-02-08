import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = sc.nextInt();
            }
            M %= N;
            for (int i = N - M; i < N; i++) {
                System.out.print(array[i] + " ");
            }
            for (int i = 0; i < N - M - 1; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println(array[N - M - 1]);
        }
    }
}