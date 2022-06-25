class Solution {
    public int maxArea(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;
        
        int max = 0;
        
        while(start<end){
            
            if(nums[start]>nums[end]){
                max = Math.max(max, nums[end]*(end-start));
                end--;
            }
            
            else{
                max = Math.max(max, nums[start]*(end-start));
                start++;
            }
            
        }
        return max;
    }
}