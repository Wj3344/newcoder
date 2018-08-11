import java.util.Stack;

public class Solution {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Solution(){
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    /**
     * 把项压入堆栈顶部
     *
     * @param node 入栈元素
     */
    public void push(int node) {
        if (node <= min()) {
            stack2.push(node);
        }
        stack1.push(node);
    }

    /**
     * 移除堆栈顶部的对象，并作为此函数的值返回该对象
     */
    public void pop() {
        int temp = stack1.pop();
        if (temp == min()) {
            stack2.pop();
        }
    }

    /**
     * 查看堆栈顶部的对象，但不从堆栈中移除它
     *
     * @return
     */
    public int top() {
        return stack1.peek();
    }

    /**
     * 获取栈中的最小值
     *
     * @return
     */
    public int min() {
        if (stack2.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return stack2.peek();
        }
    }
}