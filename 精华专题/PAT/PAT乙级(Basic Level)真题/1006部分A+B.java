import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String message = scanner.nextLine();
            String[] array = message.split(" ");
            getResult(array);
        }

    }

    private static void getResult(String[] array) {
        char a = array[1].charAt(0);
        char b = array[3].charAt(0);
        StringBuilder stringBuilderA = new StringBuilder();
        StringBuilder stringBuilderB = new StringBuilder();
        int length = array[0].length();
        for (int i = 0; i < length; i++) {
            if (array[0].charAt(i) == a) {
                stringBuilderA.append(a);
            }
        }
        if (stringBuilderA.length() == 0) {
            stringBuilderA.append(0);
        }
        length = array[2].length();
        for (int i = 0; i < length; i++) {
            if (array[2].charAt(i) == b) {
                stringBuilderB.append(b);
            }
        }
        if (stringBuilderB.length() == 0) {
            stringBuilderB.append(0);
        }
        //模拟大数相加
        System.out.println(bigNumberAdd(stringBuilderA.toString(), stringBuilderB.toString()));
    }

    /**
     * 大数相加运算
     * @param a 加数a
     * @param b 加数b
     * @return 结果
     */
    private static String bigNumberAdd(String a, String b) {
        StringBuilder stringBuilderA = new StringBuilder(a.replaceFirst("^0*", ""));
        StringBuilder stringBuilderB = new StringBuilder(b.replaceFirst("^0*", ""));
        StringBuilder result = new StringBuilder();
        //补齐0，使得两个加数一样长
        int lengthA = stringBuilderA.length();
        int lengthB = stringBuilderB.length();
        //A长
        if (lengthA > lengthB) {
            lengthB = lengthA - lengthB;
            for (int i = 0; i < lengthB; i++) {
                stringBuilderB.insert(0, 0);
            }
            lengthB = lengthA;
        } else {
            lengthA = lengthB - lengthA;
            for (int i = 0; i < lengthA; i++) {
                stringBuilderA.insert(0, 0);
            }
            lengthA = lengthB;
        }
        //进行运算
        int temp = 0;
        for (int i = lengthB - 1; i >= 0; i--) {
            temp = temp + stringBuilderA.charAt(i) - '0' + stringBuilderB.charAt(i) - '0';
            result.insert(0, temp % 10);
            temp = temp / 10;
        }
        //处理进位位
        if (temp != 0) {
            result.insert(0, temp % 10);
        }
        //处理全部为0 的情况
        if (result.length() == 0) {
            result.append(0);
        }
        return result.toString();
    }
}