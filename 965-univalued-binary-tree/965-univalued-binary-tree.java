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
    List<Integer> res = new ArrayList<>();
    
    public boolean isUnivalTree(TreeNode root) {
        
        if(root == null) return true;
        travel(root);
        
        System.out.println(res);
        
        for(int i=0; i<res.size()-1; i++){
            if(res.get(i) != res.get(i+1)) return false;
        }
        return true;
    }
    
    public void travel(TreeNode root){
        if(root != null){
            res.add(root.val);
            travel(root.left);
            travel(root.right);
        }
        else{
            return;
        }
    }
    
}