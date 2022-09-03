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
    public boolean isValidBST(TreeNode root) {
        
        return isvalid(root, null, null);
    
    }
    
    public boolean isvalid(TreeNode root, Integer min, Integer max){
        
        if(root == null) return true;
        
        if((max != null && root.val >= max) || (min != null && root.val <= min)){
            return false;
        }
           
        return isvalid(root.left,min,root.val) && isvalid(root.right,root.val,max);
        
    }
    
}