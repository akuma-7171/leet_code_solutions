class Solution {
    
    int low;
    int max;
    
    
    public String longestPalindrome(String s) {
        
        for(int i=0; i<s.length(); i++){
            helper(s,i,i);
            helper(s,i,i+1);
        }
        
        return s.substring(low, low+max);
        
    }
    
    public void helper(String s, int i, int j){
        
        
        
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;  
        }
        
         if(max < j-i-1){
                low = i+1;
                max = j-i-1;
            }
        
    }
    
}