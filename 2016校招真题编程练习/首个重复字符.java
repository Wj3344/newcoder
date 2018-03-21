import java.util.*;

public class FirstRepeat {
      public char findFirstRepeat(String A, int n) {
        // write code here
        int[] array = new int[255];
        int length = A.length();
        for (int i = 0; i < length; i++) {
            char temp = A.charAt(i);
            if (array[temp] != 0) {
                return temp;
            } else {
                array[temp]++;
            }
        }
        return 0;
    }
}