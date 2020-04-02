class MyCircularQueue {

    private int[] queueData;
    private int head;
    private int tail;
    
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        queueData = new int[k];
        head = -1;
        tail = -1;
        // System.out.println("constructor success");
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else if (isEmpty()) {
            head++;
            tail++;
            queueData[tail] = value;
        } else if (tail+1 != head && tail+1 < queueData.length) {
            tail++;
            queueData[tail] = value;
        } else if (tail == queueData.length-1 && head > 0) {
            tail = 0;
            queueData[tail] = value;
        } else {
            System.out.println("New condition for enqueue: head = " + head + ", tail = " + tail + ",value = " + value);
        }
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty())
            return false;
        else if (head == tail) {
            head = -1;
            tail = -1;
        } else if (head == queueData.length-1) {
            head = 0;
        } else if (head >= 0 && head < queueData.length-1) {
            head++;
        } else {
            System.out.println("New condition for dequeue: head = " + head + ", tail = " + tail);
        }
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty())
            return head;
        else
            return queueData[head]; 
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty())
            return tail;
        else
            return queueData[tail];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if (head == -1 && tail == -1)
            return true;
        else
            return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if (head - tail == 1 || tail - head == queueData.length-1)
            return true;
        else
            return false;
        // if (head == 0 && tail == queueData.length-1)
        //     return true;
        // else if (tail == head-1)
        //     return true;
        // else
        //     return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */