class Solution {
    
    List<List<String>> res = new ArrayList<>();
    
    public List<List<String>> partition(String s) {
        palindrome(s,0,new ArrayList<>());
        return res;
    }
    
    public void palindrome(String s, int start, List<String> curr){
        
        if(start == s.length()){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=start; i<s.length(); i++){
            
            if(isvalid(s,start,i)){
                curr.add(s.substring(start,i+1));
                palindrome(s,i+1,curr);
                curr.remove(curr.size()-1);
            }
            
        }
        
    }
    
    public boolean isvalid(String s, int start, int end){
        
        while(start<end){
            
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            
            start++;
            end--;
            
        }
        return true;
    }
    
}