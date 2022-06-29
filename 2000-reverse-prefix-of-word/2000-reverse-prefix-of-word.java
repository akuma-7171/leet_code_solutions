class Solution {
    public String reversePrefix(String word, char ch) {
        
        char[] chaar = word.toCharArray();
        int end = 0;
        
        for(int i=0; i<chaar.length; i++){
            if(chaar[i] == ch){
                end = i;
                break;
            }
        }
        
        int start = 0;
        
        while(start < end){
            char temp = chaar[start];
            chaar[start] = chaar[end];
            chaar[end] = temp;
            start++;
            end--;
        }
        
        String res = new String(chaar);
        
        return res;
        
    }
}