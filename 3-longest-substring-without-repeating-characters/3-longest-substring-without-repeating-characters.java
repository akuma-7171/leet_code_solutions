class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        HashSet<Character> seen = new HashSet<>();
        
        int start = 0;
        int end = 0;
        int max = 0;
        
        
        while(end <= s.length()-1){
            
            
            if(!seen.contains(s.charAt(end))){
                seen.add(s.charAt(end++));
                max = Math.max(max,seen.size());
            }
            
            else{
                seen.remove(s.charAt(start++));
            }
            
        }
        
        return max;
    }
}