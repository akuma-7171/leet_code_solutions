class Solution {
    public boolean checkRecord(String s) {
        if(s.length() == 0) return true;
        
        for(int i=1; i<s.length()-1; i++){
            if(s.charAt(i) == 'L' && s.charAt(i+1) == 'L' && s.charAt(i-1) == 'L') return false;
        }
        
        int count = 0;
        
        for(int i=0; i<s.length(); i++){
            if(count >= 2) return false;
            if(s.charAt(i) == 'A') count++;
        }
        
        return count >= 2 ? false : true;
    }
}