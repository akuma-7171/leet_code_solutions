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
        if(root != null) travel(root,"",res);
        return  res;
    }
    
    public void travel(TreeNode root, String s, List<String> res){
        if(root.right == null && root.left == null) res.add(s+root.val);
        if(root.left != null) travel(root.left,s+root.val+"->",res);
        if(root.right != null) travel(root.right,s+root.val+"->",res);
    }
}