class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                pq.offer(matrix[i][j]);
            }
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