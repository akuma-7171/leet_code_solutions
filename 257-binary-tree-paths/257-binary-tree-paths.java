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
        
        if(root == null){
            return res;
        }
        
        String current = Integer.toString(root.val);
        
        if(root.left == null && root.right == null){
            res.add(current);
        }
        
        if(root.left != null){
            dfs(root.left, current, res);
        }
        
        if(root.right != null){
            dfs(root.right, current, res);
        }
        
        return res;
        
        
        
    }
    
    
    public void dfs(TreeNode node, String current, List<String> res){
        
         current += "->" + node.val;
        
        if(node.left == null && node.right == null){
            res.add(current);
            return;
        }
        
        if(node.left != null){
            dfs(node.left, current, res);
        }
        
        if(node.right != null){
            dfs(node.right, current, res);
        }
        
        
    }
}