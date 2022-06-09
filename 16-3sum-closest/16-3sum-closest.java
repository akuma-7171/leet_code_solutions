class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int res = nums[0]+nums[1]+nums[nums.length-1];
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++){
            
            int low = i+1;
            int high = nums.length-1;
            
            while(low < high){
                
                int cs = nums[i]+nums[low]+nums[high];
                
                if(cs > target){
                    high--;
                }
                
                else {
                    low++;
                }
                
                
                    if(Math.abs(cs-target) < Math.abs(res-target)){
                        res=cs;
                    }
                
                
            }
            
        }
        
        
        return res;
        
    }
}