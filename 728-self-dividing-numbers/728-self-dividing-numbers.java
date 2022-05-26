class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> res = new ArrayList<>();
        
        for(int i=left; i<=right; i++){
            if(helper(i)) res.add(i);
        }
        
        return res;
        
    }
    
    public boolean helper(int nums){
        
        for(char c : String.valueOf(nums).toCharArray()){
            if(c == '0' || nums%(c-'0') > 0) return false;
        }
        
        return true;
        
    }
    
}