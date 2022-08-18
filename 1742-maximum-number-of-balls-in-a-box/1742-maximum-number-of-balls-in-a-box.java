class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        
        int[] res = new int[46];
        
        
        
        while(lowLimit<=highLimit){
            
            int temp = lowLimit;
            int sum = 0;
            
            while(temp>0){
                
                sum += temp%10;
                temp/=10;
                
            }
            
            res[sum]++;
            lowLimit++;
            
        }
        
        int max =   Integer.MIN_VALUE;
        
        for(int i : res){
            max = Math.max(i,max);
        }
        
        return max;
        
        
    }
}