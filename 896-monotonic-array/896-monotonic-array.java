class Solution {
    public boolean isMonotonic(int[] nums) {
          if(nums == null || nums.length == 0){
            return false;
        }
        
       
       boolean incr = true;
       boolean decr = true;
       
       for(int i=0; i<nums.length-1; i++){
           if(nums[i] > nums[i+1]){
               incr = false;
           }
           
           if(nums[i] < nums[i+1]){
               decr = false;
           }
       }
       
       
       return incr || decr;

    }
}