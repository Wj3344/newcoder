import java.util.Stack;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        int len = getListNodeLength(head);
        if (k > len) {
            return null;
        }
        while (len > k) {
            head = head.next;
            len--;
        }
        return head;
    }

    /**
     * 求链表的节点长度
     *
     * @param head 链表头结点
     * @return 链表长度
     */
    public static int getListNodeLength(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
}