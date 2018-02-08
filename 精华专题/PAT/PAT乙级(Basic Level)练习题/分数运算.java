import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String message = scanner.nextLine();
            getResult(message);
        }
    }

    public static void getResult(String message) {
        String[] arrays = message.split(" ");
        //分解分式
        String[] temp = arrays[0].split("/");
        //分子1，分母1
        int molecular1 = Integer.parseInt(temp[0]);
        int denominator1 = Integer.parseInt(temp[1]);
        temp = arrays[1].split("/");
        //分子1，分母1
        int molecular2 = Integer.parseInt(temp[0]);
        int denominator2 = Integer.parseInt(temp[1]);
        //根据运算符计算
        char flag = arrays[2].charAt(0);
        String result = null;
        switch (flag) {
            case '+':
                molecular1 = molecular2 * denominator1 + molecular1 * denominator2;
                denominator1 = denominator1 * denominator2;
                break;
            case '-':
                molecular1 = molecular1 * denominator2 - molecular2 * denominator1;
                denominator1 = denominator1 * denominator2;
                break;
            case '*':
                molecular1 = molecular1 * molecular2;
                denominator1 = denominator1 * denominator2;
                break;
            case '/':
                molecular1 = molecular1 * denominator2;
                denominator1 = denominator1 * molecular2;
                break;
            default:
                break;
        }
        int t = getZuiDaGongYueShu(molecular1, denominator1);
        molecular1 /= t;
        denominator1 /= t;
        result = molecular1 + "/" + denominator1;
        System.out.println(result);
    }

    /**
     * 最大公约数
     *
     * @param num1
     * @param num2
     * @return 最大公约数
     */
    public static int getZuiDaGongYueShu(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        int temp = 0;
        temp = num1 % num2;
        if (temp == 0) return num2;
        else return getZuiDaGongYueShu(num2, temp);
    }
}