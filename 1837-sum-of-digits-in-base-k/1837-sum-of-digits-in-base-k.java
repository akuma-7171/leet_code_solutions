class Solution {
    public int sumBase(int n, int k) {
        
        String res = Integer.toString(n,k);
        
        int temp = Integer.parseInt(res);
        int sum = 0;
        
        while(temp>0){
            
            sum += temp%10;
            temp/=10;
            
        }
        
        return sum;
        
        
    }
}