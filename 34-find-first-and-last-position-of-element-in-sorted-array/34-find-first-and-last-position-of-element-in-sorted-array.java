class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] res = new int[2];
        res[0] =  findfirstindex(nums, target);
        res[1] = findlastindex(nums, target);
        
        return res;
        
    }
    
    public int findfirstindex(int[] nums, int target){
        
        int index = -1;
        
        int start = 0;
        int end  = nums.length-1;
        
        while(start <= end){
            
            int mid = start + (end-start)/2;
            
            if(nums[mid] >= target){
                end = mid-1;
            }
            
            else{
                start = mid+1;
            }
            
            
            if(nums[mid] == target){
                
                index = mid;
                
            }
            
            
        }
        
        return index;
    }
    
      public int findlastindex(int[] nums, int target){
        
        int index = -1;
        
        int start = 0;
        int end  = nums.length-1;
        
        while(start <= end){
            
            int mid = start + (end-start)/2;
            
            if(nums[mid] <= target){
                start = mid+1;
            }
            
            else{
                 end = mid-1;
            }
            
            
            if(nums[mid] == target){
                
                index = mid;
                
            }
            
            
        }
        
        return index;
    }
    
}