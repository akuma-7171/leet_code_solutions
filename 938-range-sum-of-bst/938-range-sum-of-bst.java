/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int sum = 0;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root == null){
            return 0;
        }
        
        dfs(root, low, high);
        
        return sum;
        
    }
    
    public void dfs(TreeNode root, int low, int high){
        
        if(root == null){
            return ;
        }
        
        int curr = root.val;
        
        if(curr >= low && curr <= high){
            sum += curr;
        }
        
        if(curr>=low){
            dfs(root.left,low,high);
        }
        
        if(curr<=high){
            dfs(root.right,low,high);
        }
        
    }
    
}