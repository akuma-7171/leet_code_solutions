class Solution {
    public double myPow(double x, int n) {
        
        double ans = 1;
        double power = n;
        
        if(power < 0){
            power = -1 * power;
        }
        
        while(power > 0){
            if(power%2 == 0){
                x = x*x;
                power = power/2;
            }
            
            else{
                ans = ans*x;
                power--;
            }
        }
        
        if(n<0){
            ans = (double) 1 / (double) ans; 
        }
        
        return ans;
        
    }
}