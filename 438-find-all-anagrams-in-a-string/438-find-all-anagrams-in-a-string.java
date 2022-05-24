class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int char_counts[] = new int[26];
        
        List<Integer> res = new ArrayList<>();
        
        if(s == null || s.length() == 0) return res;
        
        for(char c : p.toCharArray()){
            char_counts[c-'a']++;
        }
        
        int start = 0;
        int end = 0;
        
        int count = p.length();
        
        while(end < s.length()){
            
            if(char_counts[s.charAt(end++)-'a']-- >= 1) count--;
            
            if(count == 0) res.add(start);
            
            if((end-start) == p.length() && char_counts[s.charAt(start++)-'a']++ >= 0) count++;
            
        }
        
        return res;
        
    }
}