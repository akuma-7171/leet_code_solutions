class Solution {
    public int furthestBuilding(int[] nums, int bricks, int ladders) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<nums.length-1; i++){
            
            int differ = nums[i+1]-nums[i];
            
            if(differ > 0){
                pq.add(differ);
            }
            
            if(pq.size()>ladders){
                bricks-=pq.poll();
            }
            
            if(bricks<0){
                return i;
            }
            
        }
        
        return nums.length-1;
        
    }
}