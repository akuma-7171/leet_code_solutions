class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        HashMap<Integer, Integer> map3 = new HashMap<>();
        
        for(int i : nums1){
            set.add(i);
        }
        
        for(int i : nums2){
            set.add(i);
        }
        
        for(int i : nums3){
            set.add(i);
        }
        
        for(int i : nums1){
            map1.put(i, map1.getOrDefault(i,0)+1);
        }
        
        for(int i : nums2){
            map2.put(i, map2.getOrDefault(i,0)+1);
        }
        
        for(int i : nums3){
            map3.put(i, map3.getOrDefault(i,0)+1);
        }
        
        for(int i : set){
            
            if(map1.getOrDefault(i,0) >=1 && map2.getOrDefault(i,0) >=1 ){
                res.add(i);
            }
            
           else if(map1.getOrDefault(i,0) >=1 && map3.getOrDefault(i,0) >=1 ){
                res.add(i);
            }
            
            else if(map2.getOrDefault(i,0) >=1 && map3.getOrDefault(i,0) >=1 ){
                res.add(i);
            }
            
        }
        
        return res;
        
    }
}