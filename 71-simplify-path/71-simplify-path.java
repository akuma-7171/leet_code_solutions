class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> st = new Stack<>();
        
        String vals[] =  path.split("/");
        
        for(String s : vals){
            
            if(s.equals("..") && !st.isEmpty()){
                st.pop();
            }
            
            else if(!s.equals(".") && !s.equals("..") && !s.equals("")){
                st.push(s);
            }
            
        }
        
        
        return "/"+String.join("/", st);
        
    }
}