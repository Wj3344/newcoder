import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue使用时要尽量避免Collection的add()和remove()方法，
 * 而是要使用offer()来加入元素，使用poll()来获取并移出元素。
 * 它们的优点是通过返回值可以判断成功与否，
 * add()和remove()方法在失败的时候会抛出异常。
 * 如果要使用前端而不移出该元素，使用 element()或者peek()方法。
 */

public class Solution {
    public void reOrderArray(int[] array) {
        Queue<Integer> queue1 = new LinkedList<Integer>();
        Queue<Integer> queue2 = new LinkedList<Integer>();
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (array[i] % 2 == 0) {
                queue2.offer(array[i]);
            } else {
                queue1.offer(array[i]);
            }
        }
        int i = 0;
        while (!queue1.isEmpty()) {
            array[i] = queue1.poll();
            i++;
        }
        while (!queue2.isEmpty()) {
            array[i] = queue2.poll();
            i++;
        }
    }
}