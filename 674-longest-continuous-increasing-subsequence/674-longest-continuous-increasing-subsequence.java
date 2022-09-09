class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int max = 1;
        int res = 1;
        
        for(int i=1; i<nums.length; i++){
            
            if(nums[i]>nums[i-1]){
                max++;
                res = Math.max(res,max);
            }
            
            else{
                max = 1;
            } 
        }
        
        return res;
    }
}