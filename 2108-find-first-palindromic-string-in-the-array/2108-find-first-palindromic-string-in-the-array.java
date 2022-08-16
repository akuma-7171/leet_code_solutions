class Solution {
    public String firstPalindrome(String[] words) {
        
        String res = "";
        
        for(int i=0; i<words.length; i++){
            if(check(words[i])){
                res = words[i];
                break;
            }
        }
        
        return res;
        
    }
    
    private boolean check(String temp){
        
        int start = 0;
        int end = temp.length()-1;
        
        while(start<end){
            
            if(temp.charAt(start) != temp.charAt(end)){
                return false;
            }
            
            start++;
            end--;
            
            
        }
        
        return true;
        
    }
    
}