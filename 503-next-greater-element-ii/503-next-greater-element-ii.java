class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;
        
        int []out = new int[n];
        
        Stack<Integer> st = new Stack<>();
        
        Arrays.fill(out, -1);
        
        for(int i=0; i<n*2; i++){
            
            while(!st.isEmpty() && nums[st.peek()] < nums[i%n]){
                out[st.pop()] = nums[i%n];
            }
            
            if(i < n){
                st.push(i);
            }
            
        }
        return out;
    }
}