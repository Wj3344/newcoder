/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/8/11
 * Time: 21:38
 * Description:
 */
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode head) {
        // 快指针
        ListNode fast = head;
        // 慢指针
        ListNode slow = head;
        //标志--是否有环
        boolean flag = false;
        while (fast != null && fast.next != null && fast.next.next != null) {
            // 快指针后移两次
            fast = fast.next.next;
            // 慢指针后移一次
            slow = slow.next;
            // 判断是否有环
            if (fast == slow) {
                flag = true;
                break;
            }
        }
        // 有环
        if (flag) {
            //快指针指向头结点
            fast = head;
            while (fast != slow) {
                slow = slow.next;
                fast = fast.next;
            }
            // 此时相遇节点为环的入口
            return slow;
        } else {
            return null;
        }
    }
}
