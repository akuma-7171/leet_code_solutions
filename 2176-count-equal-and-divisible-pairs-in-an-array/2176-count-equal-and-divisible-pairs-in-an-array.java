class Solution {
    public int countPairs(int[] nums, int k) {
        
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        int count = 0;
        
        for(int i=0; i<nums.length; i++){
            
            if(!map.containsKey(nums[i])){
                List<Integer> neww = new ArrayList<>();
                neww.add(i);
                map.put(nums[i],neww);
            }
            
            else{
                List<Integer> dump = map.get(nums[i]);
                for(int j:dump){
                    if((i*j)%k == 0) count++;
                }
                
                dump.add(i);
                map.put(nums[i],dump);
            }
        }
        
        return count;
    }
}