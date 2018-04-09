/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/4/9
 * Time: 8:45
 * Description:
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre,
                                           int[] in, int startIn, int endIn) {
        //开始位置比结束位置大，结束，返回空
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        //创建节点
        TreeNode node = new TreeNode(pre[startPre]);
        //遍历中序遍历结果寻找节点
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]) {
                //节点左子树
                node.left = reConstructBinaryTree(pre, startPre + 1, startPre + (i - startIn), in, startIn, i - 1);
                //节点右子树
                node.right = reConstructBinaryTree(pre, startPre + 1 + (i - startIn), endPre, in, i + 1, endIn);
                //跳出循环
                break;
            }
        }
        return node;
    }
}