class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int drink = numBottles; 
        int numFull = 0;
        while(numBottles >= numExchange){ 
            numFull = numBottles / numExchange; 
            drink += numFull; 
            numBottles = numFull + (numBottles % numExchange); 
        }
        return drink;
        
    }
}