class Solution {
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        
        dfs(root, low, high);
        
        return sum;
    }
    private void dfs(TreeNode node, int low, int high){
        if(node == null) return;
        
        int currentVal = node.val;
        
        //add in sum, if its value in range
        if(currentVal >= low && currentVal <= high) sum += currentVal;
        
        //no need to check in left, if current val is less than low
        //As it given,this is BST, so in left there will lesser number
        if(currentVal >= low)
        dfs(node.left, low, high);
        
        //no need to check in right, if current val is greater that high
        if(currentVal <= high)
        dfs(node.right, low, high);
    }
    
}
