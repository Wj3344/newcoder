/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode temp = null;
        ListNode current = null;
        int tempValue = 0;
        while (list1 != null && list2 != null) {
            int num1 = list1.val;
            int num2 = list2.val;
            if (num1 <= num2) {
                tempValue = num1;
                list1 = list1.next;
            } else {
                tempValue = num2;
                list2 = list2.next;
            }
            temp = new ListNode(tempValue);
            if (head == null) {
                head = temp;
                current = temp;
            } else {
                current.next = temp;
            }
            current = temp;
        }
        if (list1 == null) {
            //list1为空（此处讲的是传入的形参）
            if (current == null) {
                head = list2;
            } else {
                //list1不为空（此处讲的是传入的形参）
                current.next = list2;
            }
        } else {
            //list2为空（此处讲的是传入的形参）
            if (current == null) {
                head = list1;
            } else {
                //list2不为空（此处讲的是传入的形参）
                current.next = list1;
            }
        }
        return head;
    }
}