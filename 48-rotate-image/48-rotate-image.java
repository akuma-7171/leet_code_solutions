class Solution {
    public void rotate(int[][] nums) {
        
       int n = nums.length;
        
        for(int i=n-1; i>=0; i--){
            for(int j=i; j>=0; j--){
                
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
                
            }
        }
        
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                
                int temp = nums[i][j];
                nums[i][j] = nums[i][n-1-j];
                nums[i][n-1-j] = temp;
                
            }
        }
        
    }
}