class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        
        List<List<Integer>> ans = new ArrayList();
        
        int start = 0, end = 0;
        
        while(end<S.length()) {
			
            if (S.charAt(start) != S.charAt(end)) {
                if (end - start >= 3) {
                    ans.add(Arrays.asList(new Integer[]{start, end-1}));
                }
				
				
                start = end;
            }
			
			
            end++;
        }
        
		// check if any remaining window left
        if (end - start >= 3) {
            ans.add(Arrays.asList(new Integer[]{start, end-1}));
        }
		
        return ans;
    }
}