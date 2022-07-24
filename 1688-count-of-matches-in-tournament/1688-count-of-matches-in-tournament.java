class Solution {
    public int numberOfMatches(int n) {
        
        if(n == 0) return 0;
        
        int playing_team = n;
        int rounds = 0;
        
        while(playing_team > 1){
            
            if(playing_team%2 != 0){
                rounds += playing_team/2;
                playing_team = 1 + playing_team/2;
            }
            
            else{
                rounds += playing_team/2;
                playing_team = playing_team/2;
            }
            
        }
        
        return rounds;
        
    }
}