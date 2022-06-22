class Solution {
    public String reorganizeString(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        
        pq.addAll(map.keySet());
        
        StringBuilder sb = new StringBuilder();
        
        while(pq.size() > 1){
            
            char curr = pq.poll();
            char next = pq.poll();
            
            sb.append(curr);
            sb.append(next);
            
            map.put(curr, map.get(curr)-1);
            map.put(next, map.get(next)-1);
            
            if(map.get(curr)>0){
                pq.add(curr);
            }
            
            if(map.get(next)>0){
                pq.add(next);
            }  
        }
        
        if(!pq.isEmpty()){
            
            char last = pq.poll();
            
            if(map.get(last)>1){
                return "";
            }
            sb.append(last);
        }
        return sb.toString();
    }
}