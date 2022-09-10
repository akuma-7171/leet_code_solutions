class Solution {
    public int minimumOperations(int[] nums) {
        
        if(nums.length == 1 && nums[0] == 0) return 0;
        if(nums.length == 1 && nums[0] != 0) return 1;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i:nums){
            if(i != 0) set.add(i);
        }
        
        return set.size();
        
    }
}