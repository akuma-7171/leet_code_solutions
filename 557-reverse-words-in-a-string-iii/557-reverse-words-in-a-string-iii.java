class Solution {
    public String reverseWords(String s) {
        
        String[] res = s.split(" ");
        
        for(int i=0; i<res.length; i++){
            char[] temp = res[i].toCharArray();
            int start = 0;
            int end = temp.length-1;
            while(start<end){
                char tempp = temp[start];
                temp[start] = temp[end];
                temp[end] = tempp;
                end--;
                start++;
            }
            
            String ss = new String(temp);
            res[i] = ss;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(String i : res){
            sb.append(i);
            sb.append(" ");
        }
        
        
        return sb.toString().trim();
    }
}