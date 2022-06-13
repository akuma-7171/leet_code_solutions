class Solution {
    public int numRescueBoats(int[] nums, int limit) {
         if(nums == null || nums.length == 0){
            return 0;
        }
        
       Arrays.sort(nums);
       
       int left = 0;
       int right = nums.length-1;
       
       int min = 0;
       
       while(left <= right){
           
           int sum = nums[left] + nums[right];
           
           if(sum <= limit){
               left++;
               right--;
           }
           
           else{
               right--;
           }
           
           min++;
           
       }
       
       
       return min;
       
       
       
       
    }
}