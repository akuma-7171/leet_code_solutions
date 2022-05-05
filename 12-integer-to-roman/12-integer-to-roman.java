class Solution {
    public String intToRoman(int num) {
        
        int codei[] = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4 , 1};
        String codes[] = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<codei.length; i++){
            while(num >= codei[i]){
                
                sb.append(codes[i]);
                
                num-=codei[i];
                
            }
            
            
        }
        
        return sb.toString();
    }
}