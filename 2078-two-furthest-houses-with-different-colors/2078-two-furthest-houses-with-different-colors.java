class Solution {
    public int maxDistance(int[] colors) {
         int i=0,ans=0;
        int j =colors.length-1;
        while(i<j){
            if(colors[i]!=colors[j]){
                ans = Math.max(ans ,  Math.abs(i-j));
                i++;
                j= colors.length-1;

            }
            else{
                j--;
            }
        }

        return ans;
    }
}