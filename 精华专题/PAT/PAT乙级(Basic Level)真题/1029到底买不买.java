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
        //保存需要的珠子个数
        int[] array = new int[123];
        //保存总的珠子个数
        int total = 0;
        String sale = scanner.nextLine();
        String buy = scanner.nextLine();
        //统计要买的珠子
        int length = buy.length();
        for (int i = 0; i < length; i++) {
            char temp = buy.charAt(i);
            total++;
            array[temp]++;
        }
        //判断是否买
        length = sale.length();
        //卖的珠子总数
        int number = length;
        for (int i = 0; i < length; i++) {
            char temp = sale.charAt(i);
            if (array[temp] != 0) {
                array[temp]--;
                total--;
                number--;
            }
        }
        if (total == 0) {
            System.out.println("Yes " + number);
        } else {
            System.out.println("No " + total);
        }
    }
}