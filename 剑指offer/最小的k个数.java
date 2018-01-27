import java.util.ArrayList;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/1/1
 * Time: 22:26
 * Description:
 */
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        if (k > input.length){
            return integerList;
        }
        qsort(input,0,input.length-1);
        for (int i = 0; i < k; i++) {
            integerList.add(input[i]);
        }
        return integerList;
    }

    public static void qsort(int[] arr, int left, int right) {
        if (left < right) {
            int index = partition(arr, left, right);//讲数组分成两部分
            qsort(arr, left, index - 1);//递归排序左子数组
            qsort(arr, index + 1, right);//递归排序右子数组
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int key = arr[left];//设置关键数key为要排序数组的第一个元素
        while (left < right) {
            while (left < right && arr[right] >= key)
                --right;
            arr[left] = arr[right];//交换比key小的记录到左侧
            while (left < right && arr[left] <= key)
                left++;
            arr[right] = arr[left];//交换比key小的记录到右侧
        }
        arr[left] = key;
        return left;//返回划分中间点，即，key右边的数全部比key大，key左边的数全部比key小
    }
}
