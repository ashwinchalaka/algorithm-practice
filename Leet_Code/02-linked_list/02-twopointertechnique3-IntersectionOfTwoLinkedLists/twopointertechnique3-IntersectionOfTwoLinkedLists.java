/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        if (headA == headB)
            return headA;
        // if (headA == headB.next)
        //     return headA;
        // if (headA.next == headB)
        //     return headB;
        // if (headA.next == headB.next)
        //     return headA.next;
        
        ListNode p1 = headA;
        int lengthA = 1;
        
        while (p1 != null) {
            lengthA++;
            p1 = p1.next;
        }
        
        ListNode p2 = headB;
        int lengthB = 1;
        
        while (p2 != null) {
            lengthB++;
            p2 = p2.next;
        }
        
        if (lengthA >= lengthB) {
            
            int difference = lengthA - lengthB;
            p1 = headA;
            
            while (difference > 0) {
                p1 = p1.next;                
                difference--;
            }
            
            p2 = headB;
            
            while (p1 != null) {
                if (p1 == p2)
                    return p1;
                p1 = p1.next;
                p2 = p2.next;
            }            
        } else if (lengthA < lengthB) {
                        
            int difference = lengthB - lengthA;
            p2 = headB;
            
            while (difference > 0) {
                p2 = p2.next;                
                difference--;
            }
            
            p1 = headA;
            
            while (p2 != null) {
                if (p1 == p2)
                    return p2;
                p1 = p1.next;
                p2 = p2.next;
            }
        } else {
            p1 = headA;
            p2 = headB;
            
            while (p1 != null) {
                if (p1 == p2)
                    return p1;
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        
        return null;
    }
}