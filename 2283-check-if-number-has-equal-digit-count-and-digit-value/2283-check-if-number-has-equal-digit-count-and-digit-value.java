class Solution {
    public boolean digitCount(String num) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        char[] res = num.toCharArray();
        
        for(int i=0; i<res.length; i++){
            map.put(res[i]-'0', map.getOrDefault(res[i]-'0',0)+1);
        }
        
        for(int i=0; i<res.length; i++){
            
            if(map.getOrDefault(i,0) != res[i]-'0') return false;
            
        }
        
        return true;
        
    }
}