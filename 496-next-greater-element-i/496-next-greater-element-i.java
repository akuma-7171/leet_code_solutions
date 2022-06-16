class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        Stack<Integer> st = new Stack<>();
        
        
        for(int nums : nums2){
            
            while(!st.isEmpty() && st.peek() < nums){
                map.put(st.pop(), nums);
            }
            
            st.push(nums);
            
        }
        
        for(int i=0; i<nums1.length; i++){
            
            nums1[i] = map.getOrDefault(nums1[i],-1);
            
        }
        
        return nums1;
        
    }
}