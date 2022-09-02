class Solution {
    public int findLucky(int[] arr) {
        
        int[] res = new int[502];
        
        for(int i:arr){
            res[i]++;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=1; i<res.length; i++){
            if(i == res[i]){
                pq.add(i);
            }
        }
        
        return !pq.isEmpty() ? pq.poll() : -1;
        
        
    }
}