class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int max = 0;
        int sum = 0;
        
        for(int i : weights){
            sum += i;
            max = Math.max(max,i);
        }
        
        if(weights.length == days){
            return max;
        }
        
        int lo = max;
        int hi = sum;
        int ans = 0;
        
        while(lo <= hi){
            
            int mid = lo + (hi-lo)/2;
            
            if(ispossible(weights,mid,days) == true){
                ans = mid;
                hi = mid-1;
            }
            
            else{
                lo = mid+1;
            }
            
        }
        
        
        return ans;
        
    }
    
    
    public boolean ispossible(int[] w, int mid, int days){
        int d = 1;
        int sum = 0;
        
        
        for(int i=0; i<w.length; i++){
            sum += w[i];
            
            if(sum > mid){
                d++;
                sum = w[i];
            }
        }
        
        
        return d <= days;
    }
}