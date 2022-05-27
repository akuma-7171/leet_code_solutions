class Solution {
    public int numberOfSteps(int nums) {
        
        if(nums == 0) return 0;
        
        int count = 0;
        
        while(nums != 0){
            
            if(nums %2 == 0){
                nums/=2;
                count++;
            }
            
            else{
                nums--;
                count++;
            }
            
        }
        
        
        return count;
        
    }
}