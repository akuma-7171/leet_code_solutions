class Solution {
    public int balancedStringSplit(String s) {
        
        int right_count = 0;
        int partition_count = 0;
        int left_count=0;
        
        for(char c : s.toCharArray()){
            
            if(c == 'R'){
                right_count++;
            }
            
            else{
                left_count++;
            }
            
            if (left_count==right_count){
                partition_count++;
                left_count=0;
                right_count=0;
            }
        }
        
        return partition_count;
    }
}