class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        HashSet<Character> map = new HashSet<>();
        
        int start = 0;
        int end = 0;
        
        int max = 0;
        
        while(end < s.length()){
            
            if(!map.contains(s.charAt(end))){
                
                map.add(s.charAt(end));
                
                max = Math.max(max, map.size());
                
                end++;
            }
            
            else{
                map.remove(s.charAt(start));
                start++;
            }
            
        }
        
        return max;
        
    }
}