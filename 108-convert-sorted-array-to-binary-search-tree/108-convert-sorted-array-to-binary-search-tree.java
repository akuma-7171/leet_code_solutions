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
    public TreeNode sortedArrayToBST(int[] nums) {
       TreeNode root = make(nums,0,nums.length-1);
        return root;
    }
    
    public TreeNode make(int[] nums, int start, int end){
        
        if(start>end) return null;
        
        int mid = start+(end-start)/2;
        
        TreeNode main = new TreeNode(nums[mid]);
        TreeNode left = make(nums,start,mid-1);
        TreeNode right = make(nums,mid+1,end);
        
        main.left = left;
        main.right = right;
        
        return main;
    }
}