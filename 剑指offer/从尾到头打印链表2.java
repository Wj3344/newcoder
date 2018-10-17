import java.util.ArrayList;

/**
 * 本次的解法在于没有使用栈数据结构，使用递归实现，栈本身也是一种递归
 */
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        printfList(listNode, arrayList);
        return arrayList;
    }

    private void printfList(ListNode listNode, ArrayList<Integer> arrayList) {
        if (listNode != null) {
            if (listNode.next != null) {
                printfList(listNode.next, arrayList);
            }
            arrayList.add(listNode.val);
        }
    }
}