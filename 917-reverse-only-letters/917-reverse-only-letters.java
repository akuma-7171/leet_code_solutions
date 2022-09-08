class Solution {
    public String reverseOnlyLetters(String s) {
        
        char[] res = s.toCharArray();
        
        int start = 0;
        int end = res.length-1;
        
        while(start<end){
            
          if(Character.isLetter(res[start]) && Character.isLetter(res[end])){
              char temp = res[start];
              res[start] = res[end];
              res[end] = temp;
              start++;
              end--;
          }
          
          else if(Character.isLetter(res[start]) == false){
              start++;
          }  
          
          else if(Character.isLetter(res[end]) == false){
              end--;
          }   
          
          else{
              start++;
              end--;
          }  
            
        }
        
        String ress = new String(res);
        return ress;   
    }
}