import java.util.*;

public class MonoSum {
    public int calcMonoSum(int[] A, int n) {
        // write code here
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j] <= A[i]) {
                    result += A[j];
                }
            }
        }
        return result;
    }
}