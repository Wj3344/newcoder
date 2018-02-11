import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> tempList = new ArrayList<Integer>();
        List<Integer> numList = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            fun(temp, tempList);
            numList.add(temp);
        }
        for (int i = 0; i < numList.size(); ) {
            int temp = numList.get(i);
            if (tempList.contains(temp)) {
                numList.remove(i);
                continue;
            }
            i++;
        }
        Comparator comparator = Collections.reverseOrder();
        Collections.sort(numList, comparator);
        for (int i = 0; i < numList.size(); i++) {
            System.out.print(numList.get(i));
            if (i < numList.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    /**
     * 进行卡拉兹(Callatz)猜想，记录每一次的值，如果list中不存在就添加
     * @param num 要进行卡拉兹(Callatz)猜想的数字
     * @param list 存储列表
     */
    private static void fun(int num, List<Integer> list) {
        while (true) {
            if (num == 1) {
                break;
            }
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (3 * num + 1) / 2;
            }
            if (!list.contains(new Integer(num))) {
                list.add(num);
            }
        }
    }
}
