/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryPlaceholder = 0;
        ListNode sumCurrent = new ListNode(l1.val+l2.val);
        if (sumCurrent.val >= 10) {
            sumCurrent.val = sumCurrent.val - 10;
            carryPlaceholder = 1;
        }
        ListNode sumHead = sumCurrent;
        l1 = l1.next;
        l2 = l2.next;
        
        while (l1 != null && l2 != null) {
            sumCurrent.next = new ListNode(l1.val+l2.val+carryPlaceholder);
            sumCurrent = sumCurrent.next;

            if (sumCurrent.val >= 10) {
                sumCurrent.val = sumCurrent.val - 10;
                carryPlaceholder = 1;
            } else {
                carryPlaceholder = 0;
            }

            l1 = l1.next;
            l2 = l2.next;
        }
        
        if (l1 == null && l2 != null) {
            while (l2 != null) {
                sumCurrent.next = new ListNode(l2.val+carryPlaceholder);
                sumCurrent = sumCurrent.next;

                if (sumCurrent.val >= 10) {
                    sumCurrent.val = sumCurrent.val - 10;
                    carryPlaceholder = 1;
                } else {
                    carryPlaceholder = 0;
                }

                l2 = l2.next;
            }
        } else if (l1 != null && l2 == null) {
            while (l1 != null) {
                sumCurrent.next = new ListNode(l1.val+carryPlaceholder);
                sumCurrent = sumCurrent.next;

                if (sumCurrent.val >= 10) {
                    sumCurrent.val = sumCurrent.val - 10;
                    carryPlaceholder = 1;
                } else {
                    carryPlaceholder = 0;
                }

                l1 = l1.next;
            }
        }
        
        if (carryPlaceholder == 1) {
            sumCurrent.next = new ListNode(carryPlaceholder);
            sumCurrent = sumCurrent.next;
            carryPlaceholder = 0;
        }
        
        return sumHead;
    }
}