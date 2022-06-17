class Solution {
    public int characterReplacement(String s, int k) {
        
        int n = s.length();
        
        int char_count[] = new int[26];
        
        int max_length = 0;
        int max_count = 0;
        
        int window_start = 0;
        
        for(int window_end = 0; window_end<s.length(); window_end++){

            char_count[s.charAt(window_end)-'A']++;
            
            int curr_count = char_count[s.charAt(window_end)-'A'];
            
            max_count = Math.max(max_count, curr_count);
            
            while(window_end-window_start-max_count+1 > k){
                char_count[s.charAt(window_start)-'A']--;
                window_start++;
            }
            
            max_length = Math.max(max_length, window_end-window_start+1);
                
        }
        return max_length;
    }
}