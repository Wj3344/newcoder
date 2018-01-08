import java.util.*;

/**
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = strings.length - 1; i >= 0; --i) {
            stringBuffer.append(strings[i] + " ");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        System.out.println(stringBuffer.toString());
    }
}