class Solution {
    public int maxScore(int[] card, int k) {
        
        
        
        int total = 0;
        
        for(int i : card){
            total += i;
        }
        
        int ans = 0;
        int window = 0;
        int n = card.length;
        
        if(n == k){
            return total;
        }
        
        for(int i=0; i<n-k-1; i++){
            window += card[i];
        }
        
        for(int i=n-k-1; i<n; i++){
            window += card[i]; 
            ans = Math.max(ans, total-window);
            window -= card[i-(n-k-1)];
        }
        
        return ans;
        
    }
}