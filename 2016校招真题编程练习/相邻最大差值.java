import java.util.*;

public class MaxDivision {
       public static int getMax(int[] array, int length) {
        int result = 0;
        for (int i = 0; i < length - 1; i++) {
            int temp = array[i + 1] - array[i];
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }

    /**
     * 快速排序
     * @param array [description]
     * @param left  [description]
     * @param right [description]
     */
    public static void quickSort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        //设定基准数
        int temp = array[left];
        //设置哨兵
        int i = left;
        int j = right;
        while (i != j) {
            //顺序很重要，要想从右往左找
            while (array[j] >= temp && i < j) {
                j--;
            }
            //再从左往右找
            while (array[i] <= temp && i < j) {
                i++;
            }
            //交换两个哨兵在数组中的位置
            //两个哨兵没有相遇
            if (i < j) {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        //最终将基准数归位
        array[left] = array[i];
        array[i] = temp;

        //继续处理左边的，这是一个递归的过程
        quickSort(array, left, i - 1);
        //继续处理右边的，这是一个递归的过程
        quickSort(array, i + 1, right);
    }

    public int findMaxDivision(int[] A, int n) {
        quickSort(A, 0, n - 1);
        return getMax(A, n);
    }
}