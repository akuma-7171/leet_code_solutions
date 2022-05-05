class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        permutation(res, new ArrayList<>(), nums);
        
        return res;
    }
    
    public void permutation(List<List<Integer>> res, List<Integer> curr, int []nums){
        
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=0; i<nums.length; i++){
            
            if(!curr.contains(nums[i])){
                curr.add(nums[i]);
                permutation(res,curr,nums);
                curr.remove(curr.size()-1);
            }
            
        }
        
    }
}