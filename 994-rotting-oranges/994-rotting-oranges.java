class Solution {
    public int orangesRotting(int[][] grid) {
        
        HashSet<String> fresh = new HashSet<>();
        HashSet<String> rotten = new HashSet<>();
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    fresh.add(""+i+j);                  // find location for both
                }
                
                else if(grid[i][j] == 2){
                    rotten.add(""+i+j);
                }
            }
        }
        
        
        int minutes = 0;
        int[][] dir = {{0,1}, {1,0}, {-1,0}, {0,-1}};
        
        while(fresh.size() > 0){
            HashSet<String> infected = new HashSet<>();
            
            for(String s : rotten){
                int i = s.charAt(0)-'0';
                int j = s.charAt(1)-'0';
                
                
                for(int[] d : dir){
                    int next_i = i+d[0];
                    int next_j = j+d[1];
                    
                    if(fresh.contains(""+next_i+next_j)){
                        fresh.remove(""+next_i+next_j);
                        infected.add(""+next_i+next_j);
                    }
                }
            }
            
            if(infected.size() == 0){
                return -1;
            }
            
            rotten = infected;
            minutes++;
            
        }
        return minutes;
    }
}