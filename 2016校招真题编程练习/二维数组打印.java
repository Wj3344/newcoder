import java.util.*;

public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        int[] array = new int[n * n];
        int temp = 0;
        for (int i = n - 1; i > -n; i--) {
            for (int j = 0,lie = i; ; j++,lie++) {
                if (lie < n && j < n && j >=0 && lie >= 0) {
                    array[temp++] = arr[j][lie];
                } else if(j >= n || lie >= n){
                    break;
                }
            }
        }
        return array;
    }
}