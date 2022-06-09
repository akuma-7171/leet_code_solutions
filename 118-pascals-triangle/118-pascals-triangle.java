class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        List<Integer> first = new ArrayList<>();
        
        first.add(1);
        
        res.add(first);
        
        for(int i=1; i<numRows; i++){
            
            List<Integer> prev = res.get(i-1);
            List<Integer> curr = new ArrayList<>();
            
            curr.add(1);
            
            for(int j=1; j<i; j++){
                curr.add(prev.get(j)+prev.get(j-1));
            }
            
            curr.add(1);
            
            res.add(curr);
            
        }
        
        return res;
        
    }
}