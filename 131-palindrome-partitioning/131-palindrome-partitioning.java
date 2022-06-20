class Solution {
    
    List<List<String>> res = new ArrayList<>();
    String strs;
    
    public List<List<String>> partition(String s) {
        strs = s;
        palindrome(new LinkedList<>(), 0);
        return res;
    }
    
    
    public void palindrome(List<String> list, int start){
        if(start == strs.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=start+1; i<=strs.length(); i++){
            String sub = strs.substring(start, i);
            
            if(isValid(sub)){
                list.add(sub);
                palindrome(list, i);
                list.remove(list.size()-1);
            }
            
        }
        
    }
    
    
    public boolean isValid(String s){
        int n = s.length();
        
        for(int i=0; i<(n/2); i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        
        return true;
    }
    
}