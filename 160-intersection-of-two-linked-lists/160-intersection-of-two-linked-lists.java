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
        
        ListNode a_pointer = l1;
        ListNode b_pointer = l2;
        
        
        while(a_pointer != b_pointer){
            
            if(a_pointer == null){
                a_pointer = l2;
            }
            
            else{
                a_pointer = a_pointer.next;
            }
            
            if(b_pointer == null){
                b_pointer = l1;
            }
            
            else{
                b_pointer = b_pointer.next;
            }
            
        }
        
        return a_pointer;
        
    }
}