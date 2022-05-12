class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (a,b) -> (b[1]-a[1]));
        
        int res = 0;
        
        for(int[] boxtype : boxTypes){
            
            int boxes = boxtype[0];
            int units = boxtype[1];
            
            if(boxes > truckSize){
                res += truckSize*units; // if nums
                break;
            }
            
            res += boxes*units;
            
            truckSize -= boxes;
        }
        
        return res;
        
    }
}