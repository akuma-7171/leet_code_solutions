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
    public boolean isSymmetric(TreeNode root) {
        
        return mirror(root, root);
        
    }
    
    public boolean mirror(TreeNode r, TreeNode s){
        
        if(r==null && s==null){
            return true;
        }
        
        if(r==null || s==null){
            return false;
        }
        
        return mirror(r.left,s.right) && mirror(r.right,s.left) && r.val == s.val;
        
    }
    
}