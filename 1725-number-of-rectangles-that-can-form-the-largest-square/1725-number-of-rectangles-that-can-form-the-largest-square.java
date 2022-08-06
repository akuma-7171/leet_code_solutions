class Solution {
    public int countGoodRectangles(int[][] recs) {
        
        List<Integer> temp = new ArrayList<>();
        
        for(int[] rec : recs){
            if(rec[0] > rec[1]){
                temp.add(rec[1]);
            }
            
            else{
                temp.add(rec[0]);
            }
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<temp.size(); i++){
            map.put(temp.get(i), map.getOrDefault(temp.get(i),0)+1);
        }
        
        System.out.println(map);
        
        int max= Integer.MIN_VALUE;
        
        for(int i : map.keySet()){
            if(i>max){
                max = i;
            }
        }
        
        return map.get(max);
        
    }
}