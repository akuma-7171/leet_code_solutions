class Solution {
    public String restoreString(String s, int[] nums) {
        
        if(s == null || s.length() == 0){
            return s;
        }
        
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0; i<nums.length; i++){
            sb.setCharAt(nums[i],s.charAt(i));
        }
        
        return sb.toString();
    }
}