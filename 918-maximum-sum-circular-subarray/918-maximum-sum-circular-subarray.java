class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int max_sum = nums[0];
        int min_sum = nums[0];
        int total = 0;
        int curr_min = 0;
        int curr_max = 0;
        
        for(int a : nums){
            
            curr_max = Math.max(curr_max+a,a);
            max_sum = Math.max(curr_max, max_sum);
            
            curr_min = Math.min(curr_min+a, a);
            min_sum = Math.min(curr_min, min_sum);
            
            total += a;
            
        }
        
        
        return max_sum > 0 ? Math.max(max_sum, total-min_sum) : max_sum;
        
    }
}