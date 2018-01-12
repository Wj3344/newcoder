import java.util.*;
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode head = null;
        ListNode p1 = null;
        ListNode p2 = null;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        while (pHead != null) {
            int num = pHead.val;
            int value = 1;
            if (map.get(num) != null) {
                value += map.get(num);
            }
            map.put(num, value);
            queue.add(num);
            pHead = pHead.next;
        }
        while (true) {
            Integer num = queue.poll();
            if (num == null) {
                break;
            }
            int value = map.get(num);
            if (value > 1) {
                continue;
            }
            p1 = new ListNode(num);
            if (head == null) {
                head = p1;
                p2 = p1;
            } else {
                p2.next = p1;
            }
            p2 = p1;
        }
        return head;
    }
}