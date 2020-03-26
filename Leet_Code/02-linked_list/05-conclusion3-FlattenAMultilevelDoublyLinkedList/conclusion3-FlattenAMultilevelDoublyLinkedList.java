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
    private static void printList(Node head) {
        Node walker = head;
        String str = "";
        
        while (walker != null) {
            str += walker.val + " -> ";
        }
        
        str = str.substring(0,str.length()-4);
        
        System.out.println(str);
    }
    
    public Node flatten(Node head) {
        Node walker = head;
        
        while (walker != null) {
            // System.out.println(walker.val);
            
            if (walker.child != null) {
                // flatten(walker.child);
                Node temp = walker.next;
                walker.next = walker.child;
                
                Node walker2 = walker.child;
                while (walker2.next != null) {
                    walker2 = walker2.next;
                }
                walker2.next = temp;
            }
            
            walker = walker.next;
            
        }
        
        printList(head);
            
        return head;
    }
}