class Solution {
    public int sumOfBeauties(int[] nums) {
        
        boolean larger[] = new boolean[nums.length];
        boolean smaller[] = new boolean[nums.length];
        
        int temp = 0;
        
        
        for(int i=0; i<nums.length-1; i++){
            if(temp < nums[i]){
                temp = nums[i];
                larger[i] = true;
            }
        }
        
        
        temp = Integer.MAX_VALUE;
        
        for(int i=nums.length-1; i>0; i--){
            if(nums[i] < temp){
                temp = nums[i];
                smaller[i] = true;
            }
        }
        
        int beauty = 0;
        
        for(int i=1; i<nums.length-1; i++){
            if(larger[i] && smaller[i]){
                beauty = beauty+2;
            }
            
            else if(nums[i] > nums[i-1] && nums[i]<nums[i+1]){
                beauty++;
            }
        }
        return beauty;
    }
}