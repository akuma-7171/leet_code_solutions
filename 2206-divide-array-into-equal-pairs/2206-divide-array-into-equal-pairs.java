class Solution {
    public boolean divideArray(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        for(Integer i : map.keySet()){
		   if(map.get(i)%2 !=0){
			    return false;
		    }	
		}
        
        return true;
        
    }
}