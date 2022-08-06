class Solution {
    public int maxProduct(int[] nums) {
        
        int max_one = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            max_one = Math.max(max_one, nums[i]);
        }
        
        for(int i=0; i<nums.length; i++){
            if(max_one == nums[i]){
                nums[i] = -1;
                break;
            }
        }
        
        int max_two = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            max_two = Math.max(max_two, nums[i]);
        }
        
        return (max_one-1)*(max_two-1);
        
        
    }
}