class Solution {
    public int fib(int n) {
        
        if(n <= 1){
            return n;
        }
        
        int []fibbo = new int[n+1];
        
        fibbo[0] = 0;
        fibbo[1] = 1;
        
        for(int i=2; i<=n; i++){
            fibbo[i] = fibbo[i-1]+fibbo[i-2];
        }
        
        return fibbo[n];
        
    }
}