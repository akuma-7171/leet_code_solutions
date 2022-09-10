class Solution {
    public int maxCoins(int[] nums) {
        Arrays.sort(nums);
        int total = 0;
        for(int i=nums.length-2; i>=nums.length/3; i-=2){
            total += nums[i];
        }
        
        return total;
    }
}