class MyLinkedList {
    
    /** Node */
    class LLNode {
        private int val;
        private LLNode next;
        
        /** Initialize node for linked list */
        public LLNode() {
            val = null;
            next = null;
        }
        
        public void setVal(int newVal) {
            val = newVal;
        }
    }

    private LLNode head;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new LLNode();
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        LLNode runner = head;
        int count = -1;
        
        if (runner != null) {
            while (runner != null) {
                count++;
                if (runner.val != null && count == index)
                    return runner.val;
                
                if (runner.next != null)
                    runner = runner.next;
                else
                    break;
            }
        }        
        
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if (head.val == null) {
            head.val = val;
            return;
        }
        
        LLNode newHead = new LLNode();
        newHead.setVal(val);
        newHead.next = head;
        head = newHead;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (head.val == null)
            return;
        
        LLNode newTail = new LLNode();
        newTail.setVal(val);
        
        LLNode runner = head;
        
        while (runner.next != null) {
            runner = runner.next;
        }
        
        runner.next = newTail;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index = 0)
            addAtHead(val);
        
        LLNode newNode = new LLNode();
        newNode.setVal(val);
        
        LLNode runner = head;
        int count = -1;
        
        while (runner.next != null) {
            count++;
            if (count > index)
                return;
            
            if (count+1 == index) {
                newNode.next = runner.next;
                runner.next = newNode;
                return;
            }
            
            runner = runner.next;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        LLNode runner = head;
        int count = -1;
        
        while (runner.next != null) {
            count++;
            if (count > index)
                return;
            
            if (count+1 == index && runner.next == null) {
                return;
            } else if (count+1 == index && runner.next != null && runner.next.next == null) {
                runner.next = null;
                return;
            } else {
                runner.next = runner.next.next;
                return;
            }
            
            runner = runner.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */