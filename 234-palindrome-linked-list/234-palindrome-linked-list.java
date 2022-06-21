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
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        ListNode revhead = rev(slow);
        
        while(revhead != null){
            
            if(revhead.val != head.val){
                return false;
            }
            
            revhead = revhead.next;
            head = head.next;
            
        }
        
        return true;
        
    }
    
    
    public ListNode rev(ListNode head){
        
        ListNode prev = null;
        
        while(head != null){
            
            ListNode head_next = head.next;
            head.next = prev;
            prev = head;
            head = head_next;
            
        }
        return prev;
        
    }
    
}