/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private static ListNode reverseListWithLength(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = null;
        
        int length = 0;
        
        while (head != null) {
            head = fastPointer.next;
            fastPointer.next = slowPointer;
            slowPointer = fastPointer;
            fastPointer = head;
            length++;
        }
        
        ListNode node4Length = new ListNode(length);
        node4Length.next = slowPointer;
        
        return node4Length;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode walkerfor1 = reverseListWithLength(l1);
        int l1Length = walkerfor1.val;
        walkerfor1 = walkerfor1.next;
        
        ListNode walkerfor2 = reverseListWithLength(l2);
        int l2Length = walkerfor2.val;
        walkerfor2 = walkerfor2.next;
        
        int sum = 0;
        
        while (walkerfor1 != null) {
            sum += walkerfor1.val * Math.pow(10,l1Length-1);
            walkerfor1 = walkerfor1.next;
            l1Length--;
        }
        
        while (walkerfor2 != null) {
            sum += walkerfor1.val * Math.pow(10,l2Length-1);
            walkerfor2 = walkerfor2.next;
            l2Length--;
        }
        
        return sum;
    }
}