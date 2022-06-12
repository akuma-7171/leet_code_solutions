class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int sum = 0;
        
        int ans = 0;
        
        HashSet<Integer> map = new HashSet<>();
       
        int i=0;
        int j=0;
        
        while(i < nums.length && j < nums.length){
            
            if(!map.contains(nums[j])){
                
                sum += nums[j];
                
                ans = Math.max(sum, ans);
                
                map.add(nums[j++]);
                
            }
            
            else{
                sum -= nums[i];
                map.remove(nums[i++]);
            }
            
        }
       
        return ans;
        
    }
}