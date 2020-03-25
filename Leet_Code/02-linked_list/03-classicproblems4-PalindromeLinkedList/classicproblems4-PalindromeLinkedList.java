/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private static ListNode reverseList(ListNode head) {
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
    
//     private static void printList(ListNode head) {
//         ListNode walker = head;
//         String str = "";
        
//         while (walker != null) {
//             str += walker.val + " -> ";
//             walker = walker.next;
//         }
        
//         str = str.substring(0, str.length()-4);
        
//         System.out.println(str);
//     }
    
    public boolean isPalindrome(ListNode head) {
        // printList(head);
        // ListNode head2 = reverseList(head);
        // printList(head2);
        // return false;
        
        if (head == null || head.next == null)
            return true;
        
        int listLength = 0;
        ListNode walker = head;
        
        while (walker != null) {
            listLength++;
            walker = walker.next;
        }
        
        walker = head;
        ListNode head2 = null;
        
        if (listLength % 2 == 0) {
            for (int i = 0; i < listLength / 2; i++) {
                walker = walker.next;
            }    
        } else {
            for (int i = 0; i < listLength / 2 + 1; i++) {
                walker = walker.next;
            }
        }
        
        head2 = walker;
        head2 = reverseList(head2);
        
        ListNode p1 = head;
        ListNode p2 = head2;
        
        while (p2 != null) {
            if (p1.val != p2.val)
                return false;
            
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return true;
    }
}