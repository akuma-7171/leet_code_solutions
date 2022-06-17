class Solution {
    public int findPairs(int[] nums, int k) {
        
        if(k<0) return 0;
        
        Arrays.sort(nums);
        
        int right = 1;
        int left = 0;
        int count = 0;
        
        while(right < nums.length){
            
            if(nums[right]-nums[left]>k){
                left++;
            }
            
            else if(nums[right]-nums[left]<k || right == left){
                right++;
            }
            
            else{
                count++;
                left++;
                right++;
                while(right < nums.length && nums[right] == nums[right-1]) right++;
            }
    
        }
        return count;    
    }
}