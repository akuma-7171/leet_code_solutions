class Solution {
    public String removeKdigits(String num, int k) {
        
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<num.length(); i++){
            
            char c = num.charAt(i);
            
            while(!st.isEmpty() && k>0 && st.peek() > c){
                st.pop();
                k--;
            }
            
            st.push(c);        
        }
        
        
        while(k>0){
            st.pop();
            k--;
        }
        
        char []s = new char[st.size()];
        
        int h = s.length-1;
        
        while(h>=0){
            s[h--] = st.pop();
        }
        
        int d = 0;
        
        while(d < s.length && s[d] == '0') d++;
        
        StringBuilder sb = new StringBuilder();
        
        while(d<s.length) sb.append(s[d++]);
        
        if(sb.length() == 0) return "0";
        
        
        return sb.toString();
        
    }
}