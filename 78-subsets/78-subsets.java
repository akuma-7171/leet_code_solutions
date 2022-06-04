class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ll = new ArrayList<>();
        
        subsets(0, nums, new ArrayList<>(), ll);
        
        return ll;
        
    }
    
    public void subsets(int index, int[] nums, List<Integer> curr, List<List<Integer>> l){
        
        l.add(new ArrayList<>(curr));
        
        for(int i=index; i<nums.length; i++){
            curr.add(nums[i]);
            subsets(i+1, nums, curr, l);
            curr.remove(curr.size()-1);
        }
        
    }
}