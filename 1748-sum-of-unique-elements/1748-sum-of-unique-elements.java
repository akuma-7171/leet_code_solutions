class Solution {
    public int sumOfUnique(int[] nums) {
        
        int[] res = new int[101];
        int sum = 0;
        
        for(int i:nums){
            res[i]++;
        }
        
        for(int i=0; i<res.length; i++){
            if(res[i] == 1) sum += i;
        }
        
        return sum;
    }
}