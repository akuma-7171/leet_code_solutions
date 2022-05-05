class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(nums);
        
        backtrack(nums, 0, target, new ArrayList<Integer>()  ,res);
        
        return res;
        
    }
    
    public void backtrack(int[] nums, int index, int target, List<Integer> current, List<List<Integer>> res){
        
        if(target == 0){
            res.add(new ArrayList(current));
            return;
        }
        
        
        if(target < 0){
            return;
        }
        
        
        for(int i=index; i<nums.length; i++){
            
            if(i == index || nums[i] != nums[i-1]){
                current.add(nums[i]);
                backtrack(nums, i+1, target-nums[i], current, res);
                current.remove(current.size()-1);
            }
            
        }
        
    }
    
}