class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int exc = 0;
        int inc = 0;
        
        int[] count = new int[10001];
        
        for(int val : nums) count[val]++;
        
        for(int i=0; i<=10000; i++){
            int ni = exc+count[i]*i;
            int ne = Math.max(inc, exc);
            
            inc = ni;
            exc = ne;
        }
        
        
        return Math.max(inc, exc);
        
    }
}