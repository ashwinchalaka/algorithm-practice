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
            ListNode fast1 = head;
            int cycleCount = 0;

            while (cycleCount < 10000) {
                fast1 = fast1.next.next;
                slow1 = slow1.next;
                
                if (fast1 == null || fast1.next == null || fast1.next.next == null)
                    return null;
                else if (fast1.next == head)
                    return head;
                
                if (fast1 == slow1) {
                    ListNode slow2 = head; 
                    while (slow2 != slow1){
                        slow1 = slow1.next;
                        slow2 = slow2.next;
                    }
                    return slow1;
                }
                cycleCount++;
            }
        }
        
        return null;
    }
}