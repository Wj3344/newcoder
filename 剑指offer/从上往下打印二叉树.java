import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * public class TreeNode {
 * int val = 0;
 * TreeNode left = null;
 * TreeNode right = null;
 * <p>
 * public TreeNode(int val) {
 * this.val = val;
 * <p>
 * }
 * <p>
 * }
 */
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root != null) {
            //层序遍历时保存结点的队列
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
        /*
        add        增加一个元索                     如果队列已满，则抛出一个IIIegaISlabEepeplian异常
    　　remove   移除并返回队列头部的元素    如果队列为空，则抛出一个NoSuchElementException异常
    　　element  返回队列头部的元素             如果队列为空，则抛出一个NoSuchElementException异常
    　　offer       添加一个元素并返回true       如果队列已满，则返回false
    　　poll         移除并返问队列头部的元素    如果队列为空，则返回null
    　　peek       返回队列头部的元素             如果队列为空，则返回null
    　　put         添加一个元素                      如果队列满，则阻塞
    　　take        移除并返回队列头部的元素     如果队列为空，则阻塞
         */
            //根节点入队
            queue.offer(root);
            while (!queue.isEmpty()) {
                //队列不空时，弹出一个结点，访问它，并把它的所有孩子结点入队列。
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
        }
        return list;
    }
}