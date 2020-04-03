class MinStack {
    List<Integer> stackData;
    
    /** initialize your data structure here. */
    public MinStack() {
        stackData = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        stackData.add(x);
    }
    
    public void pop() {
        stackData.remove(stackData.size()-1);
    }
    
    public int top() {
        return stackData.get(stackData.size()-1);
    }
    
    public int getMin() {
        if (stackData.size() == 1)
            return stackData.get(0);
        else {
            int min = stackData.get(0);
            for (int i = 1; i < stackData.size(); i++) {
                if (stackData.get(i) < min)
                    min = stackData.get(i);
            }
            return min;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */