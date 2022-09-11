class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        if(nums.length == 1 && k == 1) return 0;
        
        Arrays.sort(nums);
        
        int start = 0;
        int end = k-1;
        
        int min = Integer.MAX_VALUE;
        
        while(end<nums.length){
            min = Math.min(min, nums[end++]-nums[start++]); 
        }
        
        return min;
    }
}