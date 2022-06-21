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
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        
        ListNode temp = head;
        
        while(fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        temp.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        
        return merge(left,right);
        
    }
    
    public ListNode merge(ListNode l, ListNode r){
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        
        while( l!=null && r!=null ){
            
            if(l.val < r.val){
                curr.next = l;
                l = l.next;
            }
            
            else{
                curr.next = r;
                r = r.next;
            }
            
            curr = curr.next;
            
        } 
        
        if(l != null){
            curr.next = l;
            l = l.next;
        }
        
        if(r != null){
            curr.next = r;
            l = r.next;
        }
        
        return dummy.next;
        
    }
    
}