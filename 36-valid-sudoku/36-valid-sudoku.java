class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> seen = new HashSet<>();
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
              char c = board[i][j];
              
                if(c != '.'){
                    if(!seen.add(c+" in row "+i) || 
                       !seen.add(c+" in column "+j) ||
                       !seen.add(c+ " in boxes "+i/3+j/3)){
                        return false;
                    }
                }
            }
        }
        
        
        return true;
        
    }
}