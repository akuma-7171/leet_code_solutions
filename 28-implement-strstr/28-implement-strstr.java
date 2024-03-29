class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length() == 0 || haystack.equals(needle)) return 0;
        
        for(int i=0; i<=haystack.length()-needle.length(); i++){
            
            String check = haystack.substring(i, i+needle.length());
            
            if(check.equals(needle)) return i;
            
        }
        
        return -1;
        
    }
}