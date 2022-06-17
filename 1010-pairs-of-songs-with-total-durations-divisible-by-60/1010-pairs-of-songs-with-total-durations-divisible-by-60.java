class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        int []rem = new int[60];
        int res = 0;
        
        for(int t : time){
            
            res += rem[(600-t)%60];
            rem[t%60] += 1;
            
        }
        
        return res;
        
    }
}