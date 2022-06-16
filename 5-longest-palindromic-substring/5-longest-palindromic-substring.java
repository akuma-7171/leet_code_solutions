class Solution {
    
    int lo;
    int maxlen;
    
    
    public String longestPalindrome(String s) {
        
        if(s.length() < 2){
            return s;
        }
        
        for(int i=0; i<s.length(); i++){
            helper(s,i,i);
            helper(s,i,i+1);
        }
        
        return s.substring(lo,lo+maxlen);
        
    }
    
    public void helper(String s, int i, int j){
        
        while(i>=0 && j<s.length() &&(s.charAt(i) == s.charAt(j))){
            i--;
            j++;
        }
        
        
        if(maxlen < j-i-1){
            lo = i+1;
            maxlen = j-i-1;
        }
        
    }
    
}