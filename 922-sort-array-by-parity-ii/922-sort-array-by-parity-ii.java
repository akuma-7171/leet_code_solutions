class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        if(nums == null || nums.length == 0) return nums;
        
        int[] even = new int[nums.length/2];
        int[] odd = new int[nums.length/2];
        int even_index = 0;
        int odd_index = 0;
        
        for(int i: nums){
            if(i%2 == 0) even[even_index++] = i;
            else{
                odd[odd_index++] = i;
            }
        }
        
        int e = 0;
        int o = 1;
        
        for(int i=0; i<even.length;i++){
            nums[e] = even[i];
            nums[o] = odd[i];
            e+=2;
            o+=2;
        }

        return nums;
    }
}