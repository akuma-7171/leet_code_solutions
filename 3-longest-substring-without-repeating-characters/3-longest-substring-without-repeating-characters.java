class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start = 0;
        int end =   0;
        
        int max = 0;
        
        HashSet<Character> map = new HashSet<>();
        
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