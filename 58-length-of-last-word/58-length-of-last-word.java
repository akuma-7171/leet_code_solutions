class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim();
        
        int count = 0;
        
        char c[] = s.toCharArray();
        
        Stack<Character> st = new Stack<>();
        
        for(char cc : c){
            st.push(cc);
        }
        
        while(!st.isEmpty()){
            if(st.peek() == ' '){
                break;
            }
            
            else{
                count++;
                st.pop();
            }
        }
        
        
        return count;
        
    }
}