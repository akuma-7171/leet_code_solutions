class Solution {
    public int repeatedNTimes(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        int out = 0;
        
        for(int i=0; i<nums.length; i++){
            
            if(map.get(nums[i]) == nums.length/2){
                out = nums[i];
                break;
            }
            
        }
        
        return out;
        
        
    }
}