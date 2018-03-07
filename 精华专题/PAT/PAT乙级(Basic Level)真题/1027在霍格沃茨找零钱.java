import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        //应付的钱
        String pay = scanner.next();
        //实际带的钱
        String need = scanner.next();
        //开始转换
        String[] pays = pay.split("\\.");
        String[] needs = need.split("\\.");
        int[] array = {493, 29, 1};
        long P = 0;
        long A = 0;
        for (int i = 0; i < 3; i++) {
            P += Integer.parseInt(pays[i]) * array[i];
            A += Integer.parseInt(needs[i]) * array[i];
        }
        A -= P;
        long temp = A / 493;
        System.out.print(temp + ".");
        A = A - temp * 493;
        A = Math.abs(A);
        temp= A / 29;
        System.out.print( temp+ ".");
        A = A - temp * 29;
        System.out.println(A);
    }
}