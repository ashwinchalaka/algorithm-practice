/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
//     private static void printList(ListNode head) {
//         ListNode walker = head;
//         String str = "";
        
//         while (walker != null) {
//             str += walker.val + " -> ";
//             walker = walker.next;
//         }
        
//         str = str.substring(0,str.length()-4);
        
//         System.out.println(str);
//     }
    
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
        // if (head == null)
            return head;
        
        ListNode headNext = head.next;
        
        // System.out.println(head.val);
        // printList(head);
        
        ListNode newHead = reverseList(headNext);
        
        // printList(headNext);
        
        // printList(newHead);
        
        headNext.next = head;
        head.next = null;
        
        // printList(head);
        
        return newHead;
    }
}