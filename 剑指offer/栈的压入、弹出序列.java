import java.util.Stack;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/10/6
 * Time: 21:30
 * Description:
 */
public class Solution {
    /**
     * 借用一个辅助的栈，遍历压栈顺序，先讲第一个放入栈中，这里是1，
     * 然后判断栈顶元素是不是出栈顺序的第一个元素，这里是4，很显然1≠4，所以我们继续压栈，
     * 直到相等以后开始出栈，出栈一个元素，则将出栈顺序向后移动一位，直到不相等，这样循环等压栈顺序遍历完成，
     * 如果辅助栈还不为空，说明弹出序列不是该栈的弹出顺序。
     *
     * @param pushA
     * @param popA
     * @return
     */
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        // 保证两个数组内部不为空
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }
        // 创建辅助栈
        Stack<Integer> stack = new Stack<>();
        // 用于标志出栈标号
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            // 压入辅助栈
            stack.push(pushA[i]);
            // 栈不为空，并且栈顶元素等于弹出栈
            while ((!stack.empty()) && stack.peek() == popA[index] && index < popA.length) {
                // 出栈一个元素
                stack.pop();
                // 标志问后移一位
                index++;
            }
        }
        return stack.empty();
    }
}
