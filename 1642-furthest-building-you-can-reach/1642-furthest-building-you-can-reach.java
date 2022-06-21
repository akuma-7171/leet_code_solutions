class Solution {
    public int furthestBuilding(int[] height, int brick, int ladder) {
        
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        
        for(int i=1; i<height.length; i++){
            int differ = height[i]-height[i-1];
            
            if(differ > 0){
                
                if(minheap.size() < ladder){
                    minheap.offer(differ);
                }
                else{
                    int br = differ;
                    
                    if(minheap.size()  > 0 && minheap.peek() < differ){
                        br = minheap.remove();
                        minheap.offer(differ);
                    }
                    
                    if(brick-br >= 0){
                        brick-=br;
                    }
                    
                    else{
                        return i-1;
                    }
                }
                
            }
        }
        
        
        return height.length-1;
        
    }
}