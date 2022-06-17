class Solution {
    public int maxScore(int[] nums, int k) {
        
        int total = 0;
        int n = nums.length;
        
        for(int i : nums){
            total += i;
        }
        
        int window = 0;
        int ans = 0;
        
        if(n==k){
            return total;
        }
        
        for(int i=0; i<n-k-1; i++){
            window += nums[i];
        }
        
        for(int i=n-k-1; i<n; i++){
            
            window += nums[i];
            ans = Math.max(ans, total-window);
            window -= nums[i-(n-k-1)];
            
        }
        return ans;
    }
}