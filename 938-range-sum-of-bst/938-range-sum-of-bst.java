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
    int sum = 0;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root == null){
            return 0;
        }
        
        search(root, low, high);
        
        return sum;
        
        
    }
    
    public void search(TreeNode root, int low, int high){
        
        
        if(root == null)
            return ;
        
         int currval = root.val;
    
        if(currval >= low && currval <= high) sum += currval;
    
        if(currval >= low) search(root.left, low, high);
    
        if(currval <= high) search(root.right, low, high);
    
        }   
    
}