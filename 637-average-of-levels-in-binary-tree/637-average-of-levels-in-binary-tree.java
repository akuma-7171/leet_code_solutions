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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> res = new ArrayList<>();
        
        Queue<TreeNode> bfs = new LinkedList<>();
        
        if(root == null){
            return res;
        }
        
        bfs.add(root);
        
        while(!bfs.isEmpty()){
            
            double sum = 0.0;
            for(TreeNode node : bfs){
                sum += node.val;
            }
            
            res.add((sum/bfs.size()));
            
            List<TreeNode> child = new ArrayList<>();
            
            while(!bfs.isEmpty()){
                TreeNode curr = bfs.poll();
                
                if(curr.left != null){
                    child.add(curr.left);
                }
                
                if(curr.right != null){
                    child.add(curr.right);
                }
            }
            
            for(int i=0; i<child.size(); i++){
                bfs.add(child.get(i));
            }
            
        }
        
        return res;
    }
}