import java.util.*;

public class StringRotation {
     public String rotateString(String A, int n, int p) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = p +1; i < n; i++) {
            stringBuffer.append(A.charAt(i));
        }
        for (int i = 0 ; i <= p; i++) {
            stringBuffer.append(A.charAt(i));
        }
        return stringBuffer.toString();
    }
}