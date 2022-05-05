class Solution {
    public int myAtoi(String s) {
        
        int len = s.length();
        
        int index = 0;
        
        while(index < len && s.charAt(index) == ' '){
            index++;
        }
        
        boolean isnegative = false;
        
        if(index < len){
            
            if(s.charAt(index) == '-'){
                isnegative = true;
                index++;
            }
            
            else if(s.charAt(index) == '+'){
                index++;
            }
            
        }
        
        int res = 0;
        
        while(index < len && Character.isDigit(s.charAt(index))){
            
            int digit = s.charAt(index)-'0';
            
            if(res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE/10 && digit > 7){
                return isnegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            
            res = (res*10)+digit;
            
            index++;
            
        }
        
        
        return isnegative ? -res : res;
        
    }
}