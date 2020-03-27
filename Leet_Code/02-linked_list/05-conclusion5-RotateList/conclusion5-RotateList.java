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
        
        ListNode nodeToMove = null;
        ListNode nodeBefore = null;
        ListNode nodeAfter = null;
        
        for (int i = 0; i < k; i++) {
            nodeToMove = head;
            while (nodeToMove.next != null) {
                if (nodeToMove.next.next == null)
                    nodeBefore = nodeToMove;
                nodeToMove = nodeToMove.next;
            }
            nodeAfter = nodeToMove.next;
            
            nodeBefore.next = nodeAfter;
            nodeToMove.next = head;
            head = nodeToMove;
        }
        
        return head;
    }
}