class MinStack {

  Stack<Integer> st1, st2;
    public MinStack() {
        
        st1 = new Stack<>();
        st2 = new Stack<>();
        
    }
    
    public void push(int x) {
        
        if(st1.isEmpty()){
            st1.push(x);
            st2.push(x);
        }

        else{
            st1.push(x);
            if(st2.peek() > x){
                st2.push(x);
            }
            else{
                st2.push(st2.peek());
            }
        }
        
    }
    
    public void pop() {
        
        if(st1.isEmpty() == true){
            return;
        }

        st1.pop();
        st2.pop();
        
    }
    
    public int top() {
        if(st1.isEmpty() == true){
            return -1;
        }

        return st1.peek();
        
    }
    
    public int getMin() {
        
        if(st2.isEmpty()==true){
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