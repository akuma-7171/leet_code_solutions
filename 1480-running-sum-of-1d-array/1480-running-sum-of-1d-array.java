class Solution {
    public int[] runningSum(int[] nums) {
        
        nums[0] = nums[0];
        nums[1] = nums[0]+nums[1];
        
        for(int i=2; i<nums.length; i++){
            nums[i] = nums[i-1]+nums[i];
        }
        
        return nums;
        
    }
}