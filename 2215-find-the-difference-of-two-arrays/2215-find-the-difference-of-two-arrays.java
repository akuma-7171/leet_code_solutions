class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i:nums2){
            set2.add(i);
        }
        
        for(int i:nums1){
            set1.add(i);
        }
        
        for(int i : set1){
            if(!set2.contains(i)){
                temp1.add(i);
            }
        }
        
        for(int i : set2){
            if(!set1.contains(i)){
                temp2.add(i);
            }
        }
        
        res.add(temp1);
        res.add(temp2);
        
        return res;
        
        
    }
}