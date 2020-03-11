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
        
        ListNode walker1 = head;
        ListNode walker2 = head;
        
        while (walker1.next) {
            walker2 = walker1;
            while (walker2.next) {
                // if (walker2.next == walker1)
                //     return true;
                walker2 = walker2.next;
            }
            walker1 = walker1.next;
        }
        return false;
    }
}