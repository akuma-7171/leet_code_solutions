class Solution {
    public int mostFrequent(int[] nums, int key) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == key){
                map.put(nums[i+1], map.getOrDefault(nums[i+1],0)+1);
            }
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int i:map.values()){
            max = Math.max(max,i);
        }
        
        int res = -1;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (max == entry.getValue()){
                res = entry.getKey();
            }
        }
        
        
        return res;
        
    }
}