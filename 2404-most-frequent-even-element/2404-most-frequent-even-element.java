class Solution {
    public int mostFrequentEven(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i: nums){
            if(i%2 == 0) map.put(i, map.getOrDefault(i,0)+1);
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int i: map.values()){
            max = Math.max(max, i);
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i : map.keySet()){
            if(map.get(i) == max){
                min = Math.min(min,i);
            }
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}