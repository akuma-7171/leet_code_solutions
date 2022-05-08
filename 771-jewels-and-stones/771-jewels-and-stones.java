class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        HashSet<Character> map = new HashSet<>();
        
        int res = 0;
        
        for(int i=0; i<jewels.length(); i++){
            map.add(jewels.charAt(i));
        }
        
        for(int j=0; j<stones.length(); j++){
            
            if(map.contains(stones.charAt(j))){
                res++;
            }
      }
               
          return res;     
               
    }
               
}               