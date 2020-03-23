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
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        else if (head.next == null)
            return false;
        else if (head == head.next)
            return true;
        else {
            ListNode slow1 = head;
            ListNode fast1 = head;
            int cycleCount = 0;

            while (cycleCount < 10000) {
                
                if (fast1.next == null || fast1.next.next == null)
                    return false;
                
                fast1 = fast1.next.next;
                slow1 = slow1.next;
                
                if (slow1 == fast1)
                    return true;

                cycleCount++;
            }
        }
        
        return false;
    }
}