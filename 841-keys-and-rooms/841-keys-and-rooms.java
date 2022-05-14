class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
      boolean[] visited = new boolean[rooms.size()];
      dfs(rooms, 0, visited);
      for(int i = 0;i<rooms.size();i++){
        if(visited[i]==false)return false;
      }
      
      return true;
    }
  
    public void dfs(List<List<Integer>> rooms, int x, boolean[] visited){
       if(visited[x]==true){
       
         return;
       }
      visited[x] = true;
      
  
      for(int i = 0;i<rooms.get(x).size();i++){

        dfs(rooms, rooms.get(x).get(i), visited);
       
      }
      
     
      
   }
}