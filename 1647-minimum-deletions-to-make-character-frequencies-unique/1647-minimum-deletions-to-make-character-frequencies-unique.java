class Solution {
    public int minDeletions(String s) {
        
        int[] count_char = new int[26];
        
        for(char c : s.toCharArray()){
            count_char[c-'a']++;
        }
        
        HashSet<Integer> seen = new HashSet<>();
        
        int count = 0;
        
        for(int i=0; i<26; i++){
            
            while(count_char[i] > 0 && seen.contains(count_char[i])){
                count_char[i]--;
                count++;
            }
            
            seen.add(count_char[i]);
            
        }
        
        return count;
        
    }
}