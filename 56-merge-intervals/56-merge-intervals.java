class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length <= 1){
            return intervals;
        }
        
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0],arr2[0]));
        
        int[] curr_interval = intervals[0];
        
        List<int[]> res = new ArrayList<>();
        
        res.add(curr_interval);
        
        for(int[] interval : intervals){
            
            int curr_begin = curr_interval[0];
            int curr_end = curr_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            
            if(curr_end >= next_begin){
                curr_interval[1] = Math.max(curr_end, next_end);
            }
            
            else{
                curr_interval = interval;
                res.add(curr_interval);
            }
            
        }
        
        return res.toArray(new int[res.size()][]);
        
        
        
        
    }
}