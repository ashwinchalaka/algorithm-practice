/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null && l2 != null)
            return l2;
        if (l1 != null && l2 == null)
            return l1;
        
        ListNode newHead = null;
        ListNode walker = null;
        
        if (l1.val < l2.val) {
            newHead = l1;
            l1 = l1.next;
            walker = newHead;
        } else if (l1.val > l2.val) {
            newHead = l2;
            l2 = l2.next;
            walker = newHead;
        } else {
            newHead = l1;
            l1 = l1.next;
            walker = newHead;
            walker.next = l2;
            l2 = l2.next;
            walker = walker.next;
        }
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                walker.next = l1;
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                walker.next = l2;
                l2 = l2.next;
            } else {
                walker.next = l1;
                l1 = l1.next;
                walker = walker.next;
                walker.next = l2;
                l2 = l2.next;
            }
            walker = walker.next;
        }
        
        if (l1 == null) {
            walker.next = l2;
        } else if (l2 == null) {
            walker.next = l1;
        } else {
            System.out.println("Something went wrong.");
        }
        
        return newHead;
    }
}