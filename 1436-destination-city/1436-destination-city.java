class Solution {
    public String destCity(List<List<String>> paths) {
        
        HashSet<String> set = new HashSet<>();
        String res = "";
        
        for(List<String> node : paths){
            String first = node.get(0);
            String second = node.get(1);
            
            set.add(first);
            set.add(second);
        }
        
        HashMap<String, Boolean> map = new HashMap<>();
        
        for(String s : set){
            map.put(s, false);
        }
        
        for(List<String> node : paths){
            map.put(node.get(0),true);
        }
        
        for(List<String> node : paths){
            
            String first = node.get(0);
            
            if(map.get(first) == false){
                 res = first;
            }
            
             String second = node.get(1);
            
            if(map.get(second) == false){
                res = second;
            }
            
        }
        
        return res;
        
    }
}