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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> res = new ArrayList<>();
        
        if(root == null) return res;
        
        String curr = Integer.toString(root.val);
        
        if(root.left == null  && root.right == null){
            res.add(curr);
            return res;
        }
        
        if(root.left != null){
            dfs(root.left,curr,res);
        }
        
        if(root.right != null){
            dfs(root.right,curr,res);
        }
        
        return res;
        
    }
    
    public void dfs(TreeNode root, String curr, List<String> res){
        
        curr += "->" + root.val;
        
        if(root.left == null && root.right == null){
            res.add(curr);
            return;
        }
        
        if(root.left != null){
            dfs(root.left,curr,res);
        }
        
        if(root.right != null){
            dfs(root.right,curr,res);
        }
        
    }
    
}