class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        
        int total = 0;
        
        for(int i : nums){
            total += i;
        }
        
        int sum = 0;
        for(int i=nums.length-1; i>=0; i--){
            sum += nums[i];
            if(sum > total-sum){
                res.add(nums[i]);
                break;
            }
            
            res.add(nums[i]);
        }
        
        return res;
        
    }
}