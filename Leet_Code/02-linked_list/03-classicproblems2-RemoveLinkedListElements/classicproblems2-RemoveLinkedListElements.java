/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
        // if (head.next == null && head.val == val)
        //     return null;
        
        ListNode p0 = null;
        ListNode p1 = head;
        
        while (p1 != null) {
            if (p1.val == val && p0 == null) {
                head = p1.next;
                if (head != null)
                    p1 = head;
                else
                    break;
            } else {
                p0.next = p1.next;
                p0 = p1;
                p1 = p1.next;
            }
        }
        
        return head;
    }
}