class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        HashSet<Integer> visited_room = new HashSet<>();
        
        visited_room.add(0);
        
        Stack<Integer> st = new Stack<>();
        
        st.push(0);
        
        while(!st.isEmpty()){
            
            List<Integer> key = rooms.get(st.pop());
            
            for(int k : key){
                
                if(!visited_room.contains(k)){
                    visited_room.add(k);
                    st.push(k);
                }
                
            }
            
        }
        
        return visited_room.size() == rooms.size();
        
    }
}