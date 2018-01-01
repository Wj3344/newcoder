import java.util.*;

/**
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int[] array = new int[128];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 0 && c <= 127) {
                array[c]++;
            }
        }
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                num++;
            }
        }
        System.out.println(num);
    }
}