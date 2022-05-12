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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        return same(p,q);
        
    }
    
    public boolean same(TreeNode t1, TreeNode t2){
        
        if(t1 == null && t2 == null){
            return true;
        }
        
        if(t1 == null || t2 == null){
            return false;
        }
        
        if(t1.val != t2.val);
        
        return same(t1.left, t2.left) && same(t1.right, t2.right) && (t1.val == t2.val);
        
        
    }
}