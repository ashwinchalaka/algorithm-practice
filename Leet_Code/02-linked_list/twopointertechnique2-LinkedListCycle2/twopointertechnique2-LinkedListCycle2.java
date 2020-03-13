/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        else if (head.next == null)
            return null;
        else if (head == head.next)
            return head;
        else {
            ListNode slow1 = head;
            ListNode fast1 = head.next;
            int cycleCount = 0;

            while (cycleCount < 10000) {
                if (fast1.next != null && fast1.next.next != null) {
                    slow1 = slow1.next;
                    fast1 = fast1.next.next;
                }

                if (slow1 == fast1)
                    return slow1;

                cycleCount++;
            }
        }
        
        return null;
    }
}