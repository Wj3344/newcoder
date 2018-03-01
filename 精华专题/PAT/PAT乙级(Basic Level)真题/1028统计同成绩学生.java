import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/2/26
 * Time: 16:09
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10001];
        StringBuilder sb = new StringBuilder();
        int N = scanner.nextInt();
        //输入成绩
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        //开始查询
        for (int i = 0; i < k; i++) {
            int score = scanner.nextInt();
            int num = 0;
            for (int j = 0; j < N; j++) {
                if (array[j] == score) {
                    num++;
                }
            }
            sb.append(num + " ");
        }
        //输出
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}