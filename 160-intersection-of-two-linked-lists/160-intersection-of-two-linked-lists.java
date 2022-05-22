/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode l1, ListNode l2) {
        
        if(l1 == null || l2 == null) return null;
        
        ListNode a = l1;
        ListNode b = l2;
        
        while(a != b){
            
            if(a == null){
                a = l2;
            }
            
            else{
                a = a.next;
            }
            
            if(b == null){
                b = l1;
            }
            
            else{
                b = b.next;
            }
            
        }
        
        return a;
        
    }
}