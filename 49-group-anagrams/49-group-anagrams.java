class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> res = new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            
            map.get(sorted).add(s);
            
        }
        
        
        res.addAll(map.values());
        
        return res;
    }
}