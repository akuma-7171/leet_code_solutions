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
    public boolean hasPathSum(TreeNode root, int tar) {
        if(root == null) return false;
        
        tar-=root.val;
        
        if(root.right == null && root.left == null && tar == 0) return true;
        
        return hasPathSum(root.left,tar) || hasPathSum(root.right,tar);    
        
        
    }
}