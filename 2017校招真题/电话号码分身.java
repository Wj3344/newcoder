import java.util.Scanner;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/1/14
 * Time: 12:21
 * Description: 答题参考思路见：Resources/电话号码分身.jpg
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.next();
        }
        for (int i = 0; i < N; i++) {
            getNum(array[i]);
        }
    }

    /**
     * 对应输入中每行字符串对应的分身前的最小电话号码（允许前导0）
     *
     * @param message
     */
    public static void getNum(String message) {
        //统计字符串中的各个字母数量
        char[] chars = new char[26];
        int length = message.length();
        for (int i = 0; i < length; i++) {
            int c = message.charAt(i) - 'A';
            chars[c]++;
        }
        //各个数字的数量
        int[] nums = new int[10];
        //EIGHT独有G，如果有G就删除EIGHT，并且记录0的个数
        int G = chars[6];
        if (G > 0) {
            //删除EIGHT
            chars[4] -= G;
            chars[8] -= G;
            chars[6] -= G;
            chars[7] -= G;
            chars[19] -= G;
            nums[0] += G;
        }
        //ZERO独有Z，如果有Z，就删除ZERO，并记录2的个数
        int Z = chars[25];
        if (Z > 0) {
            //删除ZERO
            chars[25] -= Z;
            chars[4] -= Z;
            chars[17] -= Z;
            chars[14] -= Z;
            //记录2的个数
            nums[2] += Z;
        }
        //TWO独有W，如果有W，就删除所有的TWO，并且记录4的个数
        int W = chars[22];
        if (W > 0) {
            //删除TWO
            chars[19] -= W;
            chars[22] -= W;
            chars[14] -= W;
            //记录4的个数
            nums[4] += W;
        }
        //FOUR 独有U，如果有U，就删除FOUR，并记录6的个数
        int U = chars[20];
        if (U > 0) {
            //删除FOUR
            chars[5] -= U;
            chars[14] -= U;
            chars[20] -= U;
            chars[17] -= U;
            //记录6的个数
            nums[6] += U;
        }
        // SIX 独有X，如果有X，就删除SIX，并记录8的个数
        int X = chars[23];
        if (X > 0) {
            //删除SIX
            chars[18] -= X;
            chars[8] -= X;
            chars[23] -= X;
            //记录8 的个数
            nums[8] += X;
        }
        //ONE 独有O，如果有O，就删除ONE，并记录 3 的个数
        int O = chars[14];
        if (O > 0) {
            //删除ONE
            chars[14] -= O;
            chars[13] -= O;
            chars[4] -= O;
            //记录3的个数
            nums[3] += O;
        }
        //THREE 独有T，如果有T，就删除THREE，并且记录5 的个数
        int T = chars[19];
        if (T > 0) {
            //删除THREE
            chars[19] -= T;
            chars[7] -= T;
            chars[17] -= T;
            chars[4] -= T;
            chars[4] -= T;
            //记录5 的个数
            nums[5] += T;
        }
        //FIVE 独有F，如果有F，就删除FIVE，并记录7 的个数
        int F = chars[5];
        if (F > 0) {
            //删除FIVE
            chars[5] -= F;
            chars[8] -= F;
            chars[21] -= F;
            chars[4] -= F;
            //记录7 的个数
            nums[7] += F;
        }
        //NINE 独有I，如果有I，就删除NINE，并记录1 的个数
        int I = chars[8];
        if (I > 0) {
            //删除NINE
            chars[13] -= I;
            chars[8] -= I;
            chars[13] -= I;
            chars[4] -= I;
            //记录1 的个数
            nums[1] += I;
        }
        //SEVEN独有S，如果有S，就删除SEVEN，并记录9 的个数
        int S = chars[18];
        if (S > 0) {
            //删除SEVEN
            chars[18] -= S;
            chars[4] -= S;
            chars[21] -= S;
            chars[4] -= S;
            chars[13] -= S;
            //记录9 的个数
            nums[9] += S;
        }
        for (int i = 0; i < 10; i++) {
            if (nums[i] > 0) {
                for (int j = 0; j < nums[i]; j++) {
                    System.out.print(i);
                }
            }
        }
        System.out.println();
    }
}