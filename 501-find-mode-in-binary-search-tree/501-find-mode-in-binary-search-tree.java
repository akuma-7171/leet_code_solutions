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
    
    HashMap<Integer, Integer> map = new HashMap<>();
    
    public int[] findMode(TreeNode root) {
        if(root == null){
            int res[] = {};
            return res;
        }
        travel(root);
        int max = Integer.MIN_VALUE;
        
        for(int i: map.values()){
            max = Math.max(max,i);
        }
        
        List<Integer> res = new ArrayList<>();
        
        for(int i:map.keySet()){
            if(map.get(i) == max){
                res.add(i);
            }
        }
        
        int[] arr = new int[res.size()];
        for(int i=0; i<res.size(); i++){
            arr[i] = res.get(i);
        }
        
        return arr;
    }
    
    public void travel(TreeNode root){
        if(root != null){
            map.put(root.val, map.getOrDefault(root.val,0)+1);
            travel(root.left);
            travel(root.right);
        }
    }
}