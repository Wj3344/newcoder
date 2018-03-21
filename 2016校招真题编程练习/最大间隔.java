import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static int getMax(int[] array, int length) {
        int result = 0;
        for (int i = 0; i < length - 1; i++) {
            int temp = array[i + 1] - array[i];
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            int[] temp = new int[n - 1];
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < n - 1; i++) {
                for (int j = 0, k = 0; j < n - 1 && k < n; k++, j++) {
                    if (k == i) {
                        k++;
                    }
                    temp[j] = array[k];
                }
                int t = getMax(temp, n - 1);
                if (t < min) {
                    min = t;
                }
            }
            System.out.println(min);
        }

    }
}