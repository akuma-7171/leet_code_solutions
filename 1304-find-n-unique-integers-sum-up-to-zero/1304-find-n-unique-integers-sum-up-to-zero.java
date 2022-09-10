class Solution {
    public int[] sumZero(int n) {
        
        if(n == 1){
            int[] res = new int[1];
            res[0] = 0;
            return res;
        }
        
        if(n == 2){
            int[] res = new int[2];
            res[0] = -1;
            res[1] = 1;
            return res;
        }
        
        int[] result = new int[n];
        
        int sum = 0;
        
        for(int i=0; i<n-1; i++){
            result[i] = i;
            sum += result[i];
        }
        
        int neg = 0-sum;
        
        result[n-1] = neg;
        
        return result;
    }
}