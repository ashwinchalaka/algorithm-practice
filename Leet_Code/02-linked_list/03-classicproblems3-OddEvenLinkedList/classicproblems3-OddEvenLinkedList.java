/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;
        
        ListNode head1 = head;
        ListNode head2 = head.next;
        ListNode p1 = head1;
        ListNode p2 = head2;
        // boolean isOdd = true;
        
        while (p1.next != null && p2.next != null) {
            // if (isOdd) {
                // if (p2.next == null)
                //     break;
                p1.next = p1.next.next;
                p1 = p1.next;
            // } else {
                p2.next = p2.next.next;
                p2 = p2.next;
            // }
            // isOdd = !isOdd;
        }
        
        p1.next = head2;
        return head1;
    }
}