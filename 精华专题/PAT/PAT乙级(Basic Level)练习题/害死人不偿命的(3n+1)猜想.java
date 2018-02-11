import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int res = 0;
            //对任何一个自然数n，如果它是偶数，那么把它砍掉一半；如果它是奇数，
            //那么把(3n+1)砍掉一半。这样一直反复砍下去，最后一定在某一步得到n=1
            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = (num * 3 + 1) / 2;
                }
                res++;
            }
            System.out.println(res);
        }
        scanner.close();
    }
}