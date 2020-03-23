/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode p1 = head;
        ListNode p2 = null;
        int count = 0;
        
        while (p1 != null) {
            count++;
            p1 = p1.next;
            
            if (count == n+1)
                p2 = head;
            else if (p2 != null)
                p2 = p2.next;
        }
        
        if (p2 == null) {
            head = head.next;
        } else {
            if (p2.next == null || p2.next.next == null)
                p2.next = null;
            else
                p2.next = p2.next.next;
        }
        
        return head;
    }
}