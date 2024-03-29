class Solution {
    
    int count = 0;
    
    public int countSubstrings(String s) {
        
        if(s == null || s.length() == 0){
            return 0;
        }
        
        for(int i=0; i<s.length(); i++){
            
            expand(s,i,i); // odd;
            expand(s,i,i+1); // even;    
            
        }
        
        return count;
        
    }
    
    public int expand(String s , int left, int right){
        
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        
        
        return count;
        
    }
    
    
}