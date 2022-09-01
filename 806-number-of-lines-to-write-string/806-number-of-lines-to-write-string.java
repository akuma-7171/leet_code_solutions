class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        
        int[] res = new int[2];
        int count = 0;
        int sum = 0;
        
        
        for(int i=0; i<s.length(); i++){
            
            sum += widths[s.charAt(i)-'a'];
            
                if(sum>100){
                    count++;
                    sum = 0;
                    i--;
                }
            
        }
        
        res[0] = ++count;
        res[1] = sum;
        
        return res;
        
    }
}