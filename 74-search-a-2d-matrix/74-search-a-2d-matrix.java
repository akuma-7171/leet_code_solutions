class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length;
        int column = matrix[0].length;
        
        
        int left = 0;
        int right = row*column-1;
        
        
        while(left <= right){
            
            int mid = left + (right-left)/2;
            
            int mid_val = matrix[mid/column][mid%column];
            
            if(mid_val == target){
                return true;
            }
            
            else if(mid_val > target){
                right = mid-1;
            }
            
            else{
                left = mid+1;
            }
            
            
            
        }
        
        return false;
        
    }
}