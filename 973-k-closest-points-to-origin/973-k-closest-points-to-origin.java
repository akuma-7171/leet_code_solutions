class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (b[0]*b[0]+b[1]*b[1]-(a[0]*a[0]+a[1]*a[1])));
        
        for(int[] i : points){
            
            pq.offer(i);
            
            if(pq.size() > k){
                pq.remove();
            }
        }
        
        int[][] res = new int[k][2];
        
        while(k-- > 0){
            res[k] = pq.remove();
        }
        
        return res;
        
    }
}