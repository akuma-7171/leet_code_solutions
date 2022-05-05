class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> res = new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        
        for(String s : strs){
            
            char chaar[] = s.toCharArray();
            
            Arrays.sort(chaar);
            
            String sorted = new String(chaar);
            
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            
            
            map.get(sorted).add(s);
            
            
        }
        
        
        res.addAll(map.values());
        
        return res;
        
    }
}