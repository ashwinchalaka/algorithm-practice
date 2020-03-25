/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        
        int listLength = 0;
        ListNode walker = head;
        
        while (walker != null) {
            listLength++;
            walker = walker.next;
        }
        
        walker = head;
        int indexTracker = 0;
        int palindromeSum = 0;
        
        while (walker != null) {
            if (indexTracker < listLength/2)
                palindromeSum += walker.val;
            else if (indexTracker > listLength/2)
                palindromeSum -= walker.val;
            else if (listLength % 2 == 0 && indexTracker == listLength/2)
                palindromeSum -= walker.val;
            
            walker = walker.next;
            indexTracker++;
        }
        
        if (palindromeSum == 0)
            return true;
        else
            return false;
    }
}