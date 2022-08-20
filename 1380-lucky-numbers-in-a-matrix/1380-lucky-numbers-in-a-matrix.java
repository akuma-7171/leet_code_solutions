class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        int small, big;
    List<Integer> list = new ArrayList<Integer>();
    for(int itr = 0; itr < matrix.length; itr++){
        int ktr = 0;
        small = 999999;             
        for(int jtr = 0; jtr < matrix[0].length; jtr++){                
            if(small > matrix[itr][jtr]){
                small = matrix[itr][jtr];
                ktr = jtr;
            }
        }
        big = small;
        for(int jtr = 0; jtr < matrix.length; jtr++){
            big = Math.max(big, matrix[jtr][ktr]);
        }
        if(small == big) {
            list.add(small);
        }
    }
    return list;
        
    }
}