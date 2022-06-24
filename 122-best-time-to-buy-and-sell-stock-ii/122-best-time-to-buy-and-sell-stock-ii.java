class Solution {
    public int maxProfit(int[] nums) {
        
        int max = 0;
        
        for(int i=0; i<nums.length-1; i++){
            
            if(nums[i]<nums[i+1]){
                max += nums[i+1]-nums[i];
            }
            
        }
        return max;
    }
}