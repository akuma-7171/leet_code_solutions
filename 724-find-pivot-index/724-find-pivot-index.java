class Solution {
    public int pivotIndex(int[] nums) {
        
        int total = 0;
        
        for(int i : nums){
            total += i;
        }
        
        int left_sum = 0;
        
        for(int i=0; i<nums.length; i++){
            
            left_sum += nums[i];
            
            if(total-left_sum == left_sum-nums[i]){
                return i;
            }
        }
        
        return -1;
        
    }
}