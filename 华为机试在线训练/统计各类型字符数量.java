import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int englishChars = getEnglishCharCount(str);
            System.out.println(englishChars);
            int blank = getBlankCharCount(str);
            System.out.println(blank);
            int number = getNumberCharCount(str);
            System.out.println(number);
            int others = getOtherCharCount(str, englishChars + blank + number);
            System.out.println(others);
        }
    }

    /**
     * 统计出英文字母字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 英文字母的个数
     */
    public static int getEnglishCharCount(String str) {
        str = str.toLowerCase();
        int length = str.length();
        int num = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                num++;
            }
        }
        return num;
    }

    /**
     * 统计出空格字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 空格的个数
     */
    public static int getBlankCharCount(String str) {
        int length = str.length();
        int num = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                num++;
            }
        }
        return num;
    }

    /**
     * 统计出数字字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 数字的个数
     */
    public static int getNumberCharCount(String str) {
        int length = str.length();
        int num = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num++;
            }
        }
        return num;
    }

    /**
     * 统计出其它字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 其他的个数
     */
    public static int getOtherCharCount(String str, int total) {
        int length = str.length();
        return length - total;
    }
}