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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null) return res;
        dfs(root, targetSum, new ArrayList<>());
        return res;
    }
    
    public void dfs(TreeNode root, int k, List<Integer> ress){
        
        if(root != null){
            ress.add(root.val);
            k -= root.val;
            if(root.left == null && root.right == null && 0 == k){
                res.add(ress);
            }
           
            dfs(root.left,k, new ArrayList<>(ress));
            dfs(root.right,k, new ArrayList<>(ress));  
    }
  }
}    