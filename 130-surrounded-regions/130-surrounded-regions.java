class Solution {
    public void solve(char[][] board) {
        
        int row = board.length;
        int column = board[0].length;
        
        for(int i=0; i<row; i++){
            if(board[i][0] == 'O') dfs(board,i,0);
            if(board[i][column-1] == 'O') dfs(board,i,column-1);
        }
        
        for(int j=0; j<column; j++){
            if(board[0][j] == 'O') dfs(board,0,j);
            if(board[row-1][j] == 'O') dfs(board,row-1, j);
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                
                else if(board[i][j] == '*') board[i][j] = 'O';
            }
        }
        
    }
    
    public void dfs(char[][] board, int i, int j){
        
        if(i > board.length || i<0 || j>board[0].length || j<0) return;
        
        if(board[i][j] == 'O') board[i][j] = '*';
        
        if(i > 0 && board[i-1][j] == 'O') dfs(board, i-1, j);
        
        if(i<board.length-1 && board[i+1][j] == 'O') dfs(board,i+1, j);
        
        if(j<board[0].length-1 && board[i][j+1] == 'O') dfs(board,i, j+1);
        
        if(j>0 && board[i][j-1] == 'O') dfs(board,i, j-1);
        
        return;
        
    }
    
}