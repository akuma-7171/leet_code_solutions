class Solution {
    public List<String> restoreIpAddresses(String s) {
        
        List<String> res = new ArrayList<>();
        
        if(s.length() > 12 || s.length() == 0){
                return res;
        }
        
        backtrack(res, new ArrayList<>(), s, 0);
        
        return res;
        
    }
    
    public void backtrack(List<String> res, List<String> curr, String s, int start){
        
        if(start == s.length() && curr.size() == 4){
            res.add(String.join(".",curr));
            return;
        }
        
        for(int i=1; i<=3; i++){
            if(start + i > s.length()){
                return;
            }
            
            String address = s.substring(start, start+i);
            
            if(valid(address)){
                curr.add(address);
                backtrack(res,curr,s,start+i);
                curr.remove(curr.size()-1);
            }
            
        }
        
    }
    
    public boolean valid(String check){
        
      return !((check.charAt(0) == '0' && check.length() > 1) || Integer.parseInt(check) > 255);
        
    }
    
}