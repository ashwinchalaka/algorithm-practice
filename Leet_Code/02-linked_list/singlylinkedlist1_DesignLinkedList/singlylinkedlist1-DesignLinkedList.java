["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
[[],[1],[3],[1,2],[1],[1],[1]]
["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
[[],[1],[3],[1,2],[1],[0],[0]]

class MyLinkedList {
    
    /** Node */
    class LLNode {
        private int val;
        private LLNode next;
        
        /** Initialize node for linked list */
        public LLNode(int firstVal) {
            val = firstVal;
            next = null;
        }
        
        public void setVal(int newVal) {
            val = newVal;
        }
    }

    private LLNode head;
    private int length;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        length = 0;
        
        System.out.println("--------------------");
        printList();
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (head == null || index > length || index < 0)
            return -1;
        else if (index == 0)
            return head.val;
        else {
            LLNode runner = head.next;
            int count = 0;

            while (runner != null) {
                count++;

                if (count == index)
                    return runner.val;

                runner = runner.next;
            }
            
            if (count == index)
                return runner.val;
            else
                return -1;
        }
    }
    
    private void printList() {
        String listStr = "[";
        
        if (head == null) {
            listStr += "null]";
            System.out.println(listStr);
            return;
        }
        
        LLNode walker = head;
        
        while (walker != null) {
            listStr += walker.val + "] --> [";
            walker = walker.next;
        }
        
        listStr = listStr.substring(0,listStr.length()-6);
        System.out.println(listStr);
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        LLNode newHead = new LLNode(val);
        
        System.out.println("--------------------");
        printList();
        
        if (head == null)
            head = newHead;
        else {
            newHead.next = head;
            head = newHead;
        }
        
        length++;
        printList();
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        
        System.out.println("--------------------");
        printList();
        
        LLNode newTail = new LLNode(val);
        LLNode runner = head;
        
        while (runner.next != null) {
            runner = runner.next;
        }
        
        runner.next = newTail;
        length++;
        
        printList();
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        } else if (index == length) {
            addAtTail(val);
            return;
        } else if (index > 0 && index < length) {
            LLNode newNode = new LLNode(val);
            LLNode runner = head;
            int count = -1;

            System.out.println("--------------------");
            printList();
            
            while (runner.next != null) {
                count++;
                // if (count > index)
                //     return;

                if (count+1 == index) {
                    newNode.next = runner.next;
                    runner.next = newNode;
                    length++;
                    printList();
                    return;
                }

                runner = runner.next;
            }
        } else {
            System.out.println("--------------------");
            System.out.println("Invalid index location!");
            return;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (head == null || index < 0 || index > length)
            return;
        
        LLNode runner = head;
        int count = -1;
        
        System.out.println("--------------------");
        printList();
        
        while (runner.next != null) {
            count++;
            if (count+1 == index && runner.next != null && runner.next.next != null) {
                runner.next = runner.next.next;
                length--;
                printList();
                return;
            } else if (count+1 == index && runner.next != null && runner.next.next == null) {
                runner.next = null;
                length--;
                printList();
                return;
            }
            // } else if (count+1 == index && runner.next == null) {
                
            runner = runner.next;
        }
        
        printList();
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