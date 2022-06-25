class Solution {
    
    boolean visited[][];
    
    public boolean exist(char[][] board, String word) {
        
        int row = board.length;
        int column = board[0].length;
        
        visited = new boolean[row][column];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(board[i][j] == word.charAt(0) && search(board,i,j,0,word)){
                    return true;
                }
            }
        }
        
        return false;
    }
                    
    
                   
      public boolean search(char[][] board, int i, int j, int index, String word){
          
          if(index == word.length()){
              return true;
          }
          
          if(i<0 || i>=board.length || j<0 || j>= board[0].length || word.charAt(index) != board[i][j] || visited[i][j]){
              return false;
          }
          
          visited[i][j] = true;
          
          if(search(board,i+1,j,index+1,word)  ||
             search(board,i,j+1,index+1, word) ||
             search(board,i-1,j,index+1, word) ||
             search(board,i,j-1,index+1,word))
          {
              return true;
          }
          
          visited[i][j] = false;
          
          return false;
          
      }             
                   
}
                   