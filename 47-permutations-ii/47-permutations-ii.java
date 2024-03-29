class Solution {
    
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        
	Arrays.sort(nums); 
	List<List<Integer>> resultList = new ArrayList<>();
	traverse(resultList, new ArrayList<Integer>(), nums, new boolean[nums.length]);
	return resultList;
        
   }
    
    
    
   public void traverse(List<List<Integer>> resultList, List<Integer> current, int[] nums, boolean[] used) {
	if( current.size() == nums.length )
		resultList.add(new ArrayList<Integer>(current));
       
	else{
		for(int i = 0; i < nums.length; i++) {
			if( used[i] || ( i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) ) 
				continue;
			current.add(nums[i]);
			used[i] = true;
			traverse(resultList, current, nums, used);
			used[i] = false;
			current.remove(current.size() - 1);
		}
	}
       
  }
       
}