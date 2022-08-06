class Solution {
    public int maximum69Number (int num) {
        
        String temp = Integer.toString(num);
        
        char[] ch = temp.toCharArray();
        
        for(int i=0; i<ch.length; i++){
            
            if(ch[i] == '9'){
                continue;
            }
            
            else{
                ch[i] = '9';
                break;
            }
                   
        }
            
        String fin = new String(ch);
        
        int fiin = Integer.parseInt(fin);
        
        return fiin;
        
    }
}