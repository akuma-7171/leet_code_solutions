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
	int maxLevel = -1;

	public int deepestLeavesSum(TreeNode root) {
		if(root == null){
			return 0;
		}
		dfs(root, 0);
		return sum;
	}

	void dfs(TreeNode root, int level){

		if(root.left == null && root.right == null){
			if(maxLevel < level){
				sum = root.val;
				maxLevel = level;
			} else if(maxLevel == level){
				sum += root.val;
			}
			return;
		}

		if(root.left != null){
			dfs(root.left, level+1);
		}

		if(root.right != null){
			dfs(root.right, level+1);
		}
	}
}