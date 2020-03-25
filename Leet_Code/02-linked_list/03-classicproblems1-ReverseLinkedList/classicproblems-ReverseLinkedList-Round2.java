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
        ListNode fastPointer = head;
        ListNode slowPointer = null;
        
        while (head != null) {
            head = fastPointer.next;
            fastPointer.next = slowPointer;
            slowPointer = fastPointer;
            fastPointer = head;
        }
        
        return slowPointer;
    }
}