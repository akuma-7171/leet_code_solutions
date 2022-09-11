class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum = 0;
        
        for(int i=0; i<mat.length; i++){
            sum += mat[i][i];
        }
        
        int end = mat[0].length-1;
        
        for(int i=0; i<mat.length; i++){
            sum += mat[i][end--];
        }
        
        if(mat.length%2 == 0){
            return sum;
        }
        
        return sum-mat[(int)Math.ceil((double)(mat.length/2))][(int)Math.ceil((double)(mat[0].length/2))];
        
    }
}