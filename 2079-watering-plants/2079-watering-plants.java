class Solution {
    public int wateringPlants(int[] nums, int capacity) {
        
        if(nums.length == 0 || nums == null) return 0;
        
        
        int wc = capacity;
        int steps = 0;
        
        for(int i=0; i<nums.length; i++){
            
            if(nums[i] > wc){
                wc = capacity;
                steps += i*2;
            }
            
            wc -= nums[i];
            steps++;
            
        }
        
        return steps;
        
    }
}