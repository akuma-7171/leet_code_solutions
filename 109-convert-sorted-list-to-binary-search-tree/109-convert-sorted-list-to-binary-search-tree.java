/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        
        List<Integer> res = new ArrayList<>();
        
        while(head != null){
            res.add(head.val);
            head = head.next;
        }
        
       return recur(0,res.size()-1, res);
    }
    
    public TreeNode recur(int start, int end, List<Integer> res){
        
        if(start>end){
            return null;
        }
        
        int mid = start+(end-start)/2;
        
        TreeNode root = new TreeNode(res.get(mid));
        root.left = recur(start,mid-1,res);
        root.right = recur(mid+1,end,res);
        
        return root;
        
    }
    
}