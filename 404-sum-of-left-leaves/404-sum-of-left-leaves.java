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
    int ress;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
       dfs(root);
       return ress;
    }
    
    public void dfs(TreeNode root){
        
        if(root == null) return;
        
        if(root.left != null){
            if(root.left.right == null && root.left.left == null){
                ress += root.left.val;
            }
        }
        
        dfs(root.left);
        dfs(root.right);
    }
    
}