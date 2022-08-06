class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        if(nums.length == 1) return new int[]{0,1};
        
        int[] res = new int[2];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        for(int i : map.values()){
            
            if(i%2 == 0){
                res[0] += (i)/2;
            }
            
            if(i%2 != 0){
                res[0] += (i-1)/2;
            }
            
        }
        
        for(int i : map.keySet()){
            if(map.get(i)%2 == 1){
                res[1]++;
            }
        }
        
        return res;
        
    }
}