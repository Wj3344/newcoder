import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        num2 = (long) (0.5 + (double) (num2 - num1) / 100);
        long time = num2;
        int hh = (int) (time / 3600);
        time %= 3600;
        int mm = (int) (time / 60);
        time %= 60;
        int ss = (int) time;
        System.out.printf("%02d:%02d:%02d\n", hh, mm, ss);
    }
}