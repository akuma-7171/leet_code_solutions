class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int toFill= n%k==0?0:(k-n%k);
        StringBuilder sb = new StringBuilder(s);
        
        while(toFill-->0){
            sb.append(fill);
        }
        String[] ans=new String[sb.length()/k];
        
        
        for(int i=0;i<ans.length;i++){
            ans[i]=sb.substring(k*i,k*i+k);
        }
        return ans;
    }
}