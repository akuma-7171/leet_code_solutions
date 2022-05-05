class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] res = new int[n][n];
        
        int row_start = 0;
        int row_end = res.length-1;
        int column_start = 0;
        int column_end = res[0].length-1;
        
        int counter = 1;
        
        while(row_start<=row_end && column_start<=column_end){
            
           
                
                for(int i=column_start; i<=column_end; i++){
                    res[row_start][i] = counter++;
                }
                
                row_start++;
                
            
            
            
                for(int i=row_start; i<=row_end; i++){
                    res[i][column_end] = counter++;
                }
                
                column_end--;
                
            
            
            if(row_start < row_end){
                
                for(int i=column_end; i>=column_start; i--){
                    res[row_end][i] = counter++;
                }
                
                row_end--;
            }
            
            if(column_start < column_end){
                for(int i=row_end; i>=row_start; i--){
                    res[i][column_start] = counter++;
                }
                
                column_start++;
            }
            
        }
        
        
        return res;
        
    }
}