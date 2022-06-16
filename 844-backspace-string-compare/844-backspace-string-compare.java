class Solution {
    public boolean backspaceCompare(String s, String t) {
          if(s == null || s.length() == 0 || t == null || t.length() == 0){
             return false;
        }
        
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i) != '#'){
                st1.push(s.charAt(i));
            }
            
            else{
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
            
        }
        
        
        for(int i=0; i<t.length(); i++){
            
            if(t.charAt(i) != '#'){
                st2.push(t.charAt(i));
            }
            
            else{
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
            
        }
        
        
        
       while(!st1.isEmpty() && !st2.isEmpty()){
           
           char c1 = st1.pop();
           
           if(c1 != st2.pop()){
               return false;
           }
           
       }
       
       
       return st1.isEmpty() && st2.isEmpty();
        
        
    }
}