/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
class Solution {
//     private static void printList(Node head) {
//         Node walker = head;
//         String str = "";
        
//         while (walker != null) {
//             str += walker.val + " -> ";
//             walker = walker.next;
//         }
        
//         str = str.substring(0,str.length()-4);
        
//         System.out.println(str);
//     }
    
    public Node flatten(Node head) {
        if (head == null)
            return head;
        
        Node walker = head;
        Node temp = null;
        
        while (walker != null) {
            if (walker.child != null) {
                temp = walker.next;
                walker.next = flatten(walker.child);
                walker.child.prev = walker;
                walker.child = null;
            } else {
                if (walker.next == null)
                    break;
                walker = walker.next;
            }
        }
        
        if (temp != null) {
            walker.next = temp;
            temp.prev = walker;
            temp = null;
        }
        
        // printList(head);
            
        return head;
    }
}