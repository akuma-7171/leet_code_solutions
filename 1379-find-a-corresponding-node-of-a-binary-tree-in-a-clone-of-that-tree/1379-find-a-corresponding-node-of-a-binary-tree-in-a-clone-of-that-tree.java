/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode res = null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned == null) return null;
        dfs(cloned, target);
        return res;
    }
    
    public void dfs(TreeNode root, TreeNode target){
        if(root != null){
            if(root.val == target.val){
                res = root;
                return;
            }       
            dfs(root.left, target);
            dfs(root.right, target);
        }
    }
}