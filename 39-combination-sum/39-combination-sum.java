class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        if(nums == null || nums.length == 0){
            return res;
        }
        
        backtrack(res,0,new ArrayList<>(),target, nums);
        
        return res;

    }
    
    public void backtrack(List<List<Integer>> res, int index, List<Integer> curr, int target, int []nums){
        
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=index; i<nums.length; i++){
            if(nums[i]<=target){
                curr.add(nums[i]);
                backtrack(res,i,curr,target-nums[i],nums);
                curr.remove(new Integer(nums[i]));
            }
        }
        
    }
    
}