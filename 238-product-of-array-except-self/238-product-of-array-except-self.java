class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int left_product[] = new int[nums.length];
        int right_product[] = new int[nums.length];
        
        int res[] = new int[nums.length];
        
        left_product[0] = 1;
        right_product[nums.length-1] = 1;
        
        for(int i=1; i<nums.length; i++){
            left_product[i] = left_product[i-1]*nums[i-1];
        }
        
        for(int j=nums.length-2; j>=0; j--){
            right_product[j] = right_product[j+1]*nums[j+1];
        }
        
        for(int i=0; i<nums.length; i++){
            res[i] = left_product[i]*right_product[i];
        }
        
        return res;
        
    }
}