class Solution {
    public List<List<Integer>> combinationSum(int[] candidate, int target) {
        
        if(candidate.length == 0){
            return null;
        }
        
        List<List<Integer>> res = new ArrayList<>();
        
        backtrack(candidate, 0, target, new ArrayList<>(), res);
        
        return res;
        
    }
    
    
    public void backtrack(int candidate[], int index, int target, List<Integer> curr, List<List<Integer>> res){
        
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=index; i<candidate.length; i++){
            if(candidate[i] <= target){
                curr.add(candidate[i]);
                backtrack(candidate, i, target-candidate[i], curr, res);
                curr.remove(new Integer(candidate[i]));
            }
        }
        
    }
}