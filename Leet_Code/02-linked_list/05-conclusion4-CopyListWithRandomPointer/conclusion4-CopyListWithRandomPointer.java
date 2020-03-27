/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node copyHead = new Node(head.val);
        copyHead.random = head.random;
        
        Node walker = head.next;
        Node copyWalker = copyHead;
        
        while (walker != null) {
            Node copyNode = new Node(walker.val);
            
            copyNode.random = walker.random;
            
            copyWalker.next = copyNode;
            
            walker = walker.next;
            copyWalker = copyWalker.next;
        }
        
        return copyHead;
    }
}