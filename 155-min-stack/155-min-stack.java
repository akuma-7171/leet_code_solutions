class MinStack {

  Stack<Integer> st1, st2;
    
    public MinStack() {
        
        st1 = new Stack<>();
        st2 = new Stack<>();
        
    }
    
    public void push(int x) {
        
        st1.push(x);
        
        if(st2.isEmpty() || x <= st2.peek()){
            st2.push(x);
        }
        
    }
    
    public void pop() {
        
        if(st1.isEmpty()){
            return;
        }

       int val = st1.pop();
        
       if(val == st2.peek()){
           st2.pop();
       } 
        
    }
    
    public int top() {
        
        if(st1.isEmpty()){
            return -1;
        }

        return st1.peek();
        
    }
    
    public int getMin() {
        
        if(st2.isEmpty()){
            return -1;
        }

        return st2.peek();
        
}

    
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */