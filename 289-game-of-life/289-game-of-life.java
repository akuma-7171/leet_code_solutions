class Solution {
    public void gameOfLife(int[][] board) {
        
        if(board == null || board.length == 0){
            return;
        }
        
        int row = board.length;
        int column = board[0].length;
        
        int [][] tempboard = new int[row][column];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                
                int livecount = count(board,i-1,j) + count(board,i+1,j) + count(board,i,j-1) + count(board,i,j+1) + count(board, i-1,j-1) + count(board, i+1,j+1) + count(board, i+1, j-1) + count(board, i-1, j+1);
                
                if(board[i][j] == 1){
                    
                    tempboard[i][j] = (livecount < 2 || livecount > 3) ? 0 : 1;
                    
                }
                
                else{
                    tempboard[i][j] = (livecount == 3) ? 1 : 0;
                }
                
                
            }
        }
        
        
        for(int i=0; i<row; i++){
            board[i] = tempboard[i].clone();
        }
        
        
    }
    
    public int count(int [][]board, int i, int j){
        
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] == 0) return 0;
        
        return 1;
        
    }
    
}