class Solution {
    public int minCost(String s, int[] cost) {
        
       int mincost=0;
       for(int i=0;i<s.length()-1;i++){
           if(s.charAt(i)==s.charAt(i+1)){
               mincost=mincost+Math.min(cost[i],cost[i+1]);
               cost[i+1]=Math.max(cost[i],cost[i+1]);
           }
       }
        
       return mincost;
    }
}