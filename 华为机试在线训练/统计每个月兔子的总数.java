import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int month = scanner.nextInt();
            System.out.println(getTotalCount(month));
        }
    }

    /**
     * 统计出兔子总数。
     *
     * @param monthCount 第几个月
     * @return 兔子总数
     */
    public static int getTotalCount(int monthCount) {
        int sum = 0;
        if (monthCount == 1) {
            sum = 1;
        } else if (monthCount == 2) {
            sum = 1;
        }else {
            sum = getTotalCount(monthCount - 1) + getTotalCount(monthCount - 2);
        }
        return sum;
    }
}