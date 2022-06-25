class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        
        int row_start = 0;
        int row_end = matrix.length-1;
        
        int column_start = 0;
        int column_end = matrix[0].length-1;
        
        List<Integer> res = new ArrayList<>();
        
        while(row_start<=row_end && column_start<=column_end){
            
            for(int i=column_start; i<=column_end; i++){
                res.add(matrix[row_start][i]);
            }
            
            row_start++;
            
            for(int i=row_start; i<=row_end; i++){
                res.add(matrix[i][column_end]);
            }
            
            column_end--;
            
            if(row_start<=row_end){
                
                for(int i=column_end; i>=column_start; i--){
                    res.add(matrix[row_end][i]);
                }
                
                row_end--;
                    
            }
            
            if(column_start<=column_end){
                
                for(int i=row_end; i>=row_start; i--){
                    res.add(matrix[i][column_start]);
                }
                
                column_start++;
                
            }
            
        }  
        
        return res;
    }
}