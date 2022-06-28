class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> st = new Stack<>();
        
        
        String[] strs = path.split("/");
        
        
            
        for(String s : strs){
            
            if(s.equals("..") && !st.isEmpty()){
                st.pop();
            }
            
            else if(!s.equals(".") && !s.equals("..") && !s.equals("")){
                st.push(s);
            }
            
        }
        
            return "/"+String.join("/",st);
        
    }
}