class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        List<Integer> res = new ArrayList<>();
        
        for(int i:nums){
            if(i%2 == 0){
                res.add(i);
            }
        }
        
        for(int i:nums){
            if(i%2 != 0){
                res.add(i);
            }
        }
        
        int[] ress = new int[res.size()];
        
        for(int i=0; i<res.size(); i++){
            ress[i] = res.get(i);
        }
        
        return ress;
        
    }
}