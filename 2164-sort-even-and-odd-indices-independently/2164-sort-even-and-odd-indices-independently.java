class Solution {
    public int[] sortEvenOdd(int[] nums) {
        
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<nums.length; i+=2){
            min.add(nums[i]);
        }
        
        for(int i=1; i<nums.length; i+=2){
            max.add(nums[i]);
        }
        
        for(int i=0; i<nums.length; i+=2){
            nums[i] = min.poll();
        }
        
        for(int i=1; i<nums.length; i+=2){
            nums[i] = max.poll();
        }
        
        return nums;
    }
}