/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null)
            return head;
        
        // STEP #1: DETERMINE THE LENGTH OF THE LIST
        
        ListNode walker = head;
        int listLength = 0;
        
        while (walker != null) {
            listLength++;
            walker = walker.next;
        }
        
        // STEP #2: CALCULATE HOW MANY TIMES TO ROTATE USING (K % LISTLENGTH)
        
        if (k % listLength == 0) {
            return head;
        } else if (k % listLength < k) {
            k = listLength - (k % listLength);
        } else if (k % listLength >= k) {
            k = listLength - k;
        }
        
        // STEP #3: ROTATE THE LIST (# OF ROTATIONS SHOULD BE LESS THAN LISTLENGTH)
        
        // STEP 3.1 -- FIND THE NEWHEAD OF THE LIST
        walker = head;
            
        for (int i = 1; i < k; i++) {
            walker = walker.next;
        }

        ListNode newHead = walker.next;
        walker.next = null;

        // STEP 3.2 -- CONNECT OLDHEAD TO END OF NEWHEAD LIST
        walker = newHead;

        while (walker.next != null) {
            walker = walker.next;
        }

        walker.next = head;
        head = newHead;
        
        return head;
        
//         ListNode nodeToMove = null;
//         ListNode nodeBefore = null;
//         ListNode nodeAfter = null;
        
//         for (int i = 0; i < k; i++) {
//             nodeToMove = head;
//             while (nodeToMove.next != null) {
//                 if (nodeToMove.next.next == null)
//                     nodeBefore = nodeToMove;
//                 nodeToMove = nodeToMove.next;
//             }
//             nodeAfter = nodeToMove.next;
            
//             nodeBefore.next = nodeAfter;
//             nodeToMove.next = head;
//             head = nodeToMove;
//         }
        
//         return head;
    }
}