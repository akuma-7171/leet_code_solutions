class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr1[j] == arr2[i]){
                    res.add(arr1[j]);
                    arr1[j] = -1;
                }
            }
        }
        
        for(int i:arr1){
            if(i == -1) continue;
            pq.add(i);
        }
        
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
        
        int[] fin = new int[res.size()];
        
        for(int i=0; i<res.size(); i++){
            fin[i] = res.get(i);
        }
        
        return fin;
        
    }
}