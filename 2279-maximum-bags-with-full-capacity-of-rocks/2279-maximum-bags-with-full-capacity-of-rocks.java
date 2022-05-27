class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        // difference array to know how many rocks we can fill to make it full capacity
        int total=additionalRocks;
        int c=0;
        int diff[] = new int[capacity.length];
        
        for(int i=0;i<capacity.length;i++){
            diff[i]=capacity[i]-rocks[i];
        }
        //sort the array 
        Arrays.sort(diff);
        
        // to fill most of the bags, it will be benificial for us to choose the one with the lowest difference
         for(int i=0;i<capacity.length;i++){
            if(total>=diff[i]){
                total-=diff[i];
                c++;
            }
        }
        return c;
        
        
    }
}