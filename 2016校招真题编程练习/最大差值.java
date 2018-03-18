import java.util.*;

public class LongestDistance {
   public int getDis(int[] A, int n) {
        // write code here
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = A[j] - A[i];
                if(max < temp){
                    max = temp;
                }
            }
        }
        return max;
    }
}