class Solution {
    public int balancedStringSplit(String s) {
        
        int right = 0;
        int left = 0;
        int partition_count = 0;
        
        for(char c : s.toCharArray()){
            
            if(c == 'R'){
                right++;
            }
            
            else{
                left++;
            }
            
            if(right == left){
                partition_count++;
                left = 0;
                right = 0;
            }
            
        }
        
        return partition_count;
        
    }
}