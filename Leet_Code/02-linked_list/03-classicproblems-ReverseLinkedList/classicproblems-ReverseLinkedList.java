/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode p0 = head;
        ListNode p1 = head.next;
        ListNode p2 = head.next.next;
        // int count = 0;
        
        while (p2 != null) {
            p0.next = p2;
            p1.next = head;
            head = p1;
            p1 = p2;
            // count++;
            p2 = p2.next;
        }
        
        p0.next = p2;
        p1.next = head;
        head = p1;
        
        // System.out.println(count);
        return head;
    }
}