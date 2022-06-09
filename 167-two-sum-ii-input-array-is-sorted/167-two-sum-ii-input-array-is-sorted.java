class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if(nums == null || nums.length == 0){
            return nums;
        }
        
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            
            if(nums[start]+nums[end] > target){
                end--;
            }
            
            else if(nums[start]+nums[end] < target){
                start++;
            }
            
            else if(nums[start]+nums[end] == target){
                return new int[]{start+1, end+1};
            }
            
        }
        
        throw new IllegalArgumentException("not a match");
        
    }
}