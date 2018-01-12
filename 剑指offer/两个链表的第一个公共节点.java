/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        //公共节点
        ListNode common = null;
        //链表1长度
        int length1 = getListNodeLength(pHead1);
        //链表2长度
        int length2 = getListNodeLength(pHead2);
        //两个链表的长度差
        int len = length1 - length2;
        if (len >= 0) {
            //链表1比较长
            while (len > 0) {
                pHead1 = pHead1.next;
                len--;
            }
        } else {
            //链表2比较长
            len = Math.abs(len);
            while (len > 0) {
                pHead2 = pHead2.next;
                len--;
            }
        }
        while (pHead1 != null) {
            if(pHead1.equals(pHead2)){
                common = pHead1;
                break;
            }else {
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
        }
        return common;
    }

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