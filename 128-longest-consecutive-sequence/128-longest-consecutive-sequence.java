class Solution {
    public int longestConsecutive(int[] nums) {
        
       
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i,true);
        }    
        
        for(int i : nums){
            if(map.containsKey(i-1)){
                map.put(i,false);
            }
        }
        
        int msp = 0;
        int ml = 0;
        
        for(int i : nums){
            
            if(map.get(i) == true){
                
                int tl = 1;
                int tsp = i;
                
                while(map.containsKey(tsp+tl)){
                    tl++;
                }
                
                if(tl > ml){
                    msp = tsp;
                    ml = tl;
                }
                
            }
            
        }
          
        return ml;
            
    }
        
}
