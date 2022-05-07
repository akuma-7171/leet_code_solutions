class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : stones){
            q.offer(i);
        }
        
        while(q.size() > 1){
            int first = q.poll();
            int second = q.poll();
            
            if(first != second){
                q.offer(first-second);
            }
            
        }
        
        return q.isEmpty() ? 0:q.peek();
        
    }
}