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
        ListNode slow1 = head;
        ListNode fast1 = head;
        
        if (slow1 == fast1.next)
            return true;
        
        int cycleCount = 0;
        
        while (cycleCount < 100) {
            slow1 = slow1.next;
            fast1 = fast1.next.next;
            
            if (slow1 == fast1)
                return true;
            
            cycleCount++;
        }
        
        return false;
        
//         if (head == null)
//             return false;
        
//         ListNode walker1 = head;
//         ListNode walker2 = head;
        
//         if (walker1.next != null) {
//             System.out.println("1st: next not null");
//             System.out.println(walker1.val + ", " + walker1.next.val + ", " + walker1.next.next.val);
//         }
        
//         if (walker2.next.next != null)
//             System.out.println("2nd: next next not null");
        
//         // while (walker1.next) {
//         //     walker2 = walker1;
//         //     while (walker2.next) {
//         //         // if (walker2.next == walker1)
//         //         //     return true;
//         //         walker2 = walker2.next;
//         //     }
//         //     walker1 = walker1.next;
//         // }
        
//         return false;
    }
}