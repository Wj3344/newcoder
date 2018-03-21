import java.util.*;

public class StringFormat {
    public String formatString(String A, int n, char[] arg, int length) {
        int index = 0;
        while (A.contains("%s") && index < length) {
            A = A.replaceFirst("%s", arg[index++] + "");
        }
        if (index < length) {
            while (index < length) {
                A += arg[index++];
            }
        }
        return A;
    }
}