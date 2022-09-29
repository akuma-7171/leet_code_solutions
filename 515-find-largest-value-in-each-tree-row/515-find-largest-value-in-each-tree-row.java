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
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return res;
        bfs(root);
        return res;
    }
    
    public void bfs(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int max = Integer.MIN_VALUE;
            List<TreeNode> temp = new ArrayList<>();
            while(!q.isEmpty()){
                TreeNode curr = q.poll();
                if(curr.left != null) temp.add(curr.left);
                if(curr.right != null) temp.add(curr.right);
                max = Math.max(max,curr.val);
            }
            
            res.add(max);
            
            for(int i=0; i<temp.size(); i++){
                q.add(temp.get(i));
            }
        }
    }
}