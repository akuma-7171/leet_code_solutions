class Solution {
    public int maxProduct(String[] word) {
        
        if(word == null || word.length == 0) return 0;
        
        int len = word.length;
        
        int []val = new int[len];
        
        for(int i=0; i<len; i++){
            String temp = word[i];
            
            val[i] = 0;
            
            for(int j=0; j<temp.length(); j++){
                val[i] |= 1 << (temp.charAt(j)-'a');
            }
        }
        
        int max = 0;
        
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if((val[i]&val[j]) == 0 && (word[i].length() * word[j].length()) > max){
                    max = Math.max(max, (word[i].length() * word[j].length()) );
                }
            }
        }
        
        return max;
        
    }
}