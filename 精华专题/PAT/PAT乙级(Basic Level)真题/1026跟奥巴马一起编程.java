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
        String temp = scanner.nextLine();
        int N = Integer.parseInt(temp.split(" ")[0]);
        String symbol = temp.split(" ")[1];
        int line = (int) ((N * 1.0) / 2 + 0.5);
        //打印第一行
        for (int i = 0; i < N; i++) {
            System.out.print(symbol);
        }
        System.out.println();
        //打印中间
        for (int i = 1; i < line-1; i++) {
            for (int j = 0; j < N; j++) {
                if (j == 0 || j == N - 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //打印最后一行
        for (int i = 0; i < N; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}