class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : nums){
            pq.offer(i);
        }
        
        int index = 0;
        int out = 0;
        
        while(index < k){
            out = pq.poll();
            index++;
        }
        
        return out;
        
    }
}