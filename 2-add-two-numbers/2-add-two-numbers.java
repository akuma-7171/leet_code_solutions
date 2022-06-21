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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        
        int carry = 0;
        
        while(l1 != null || l2 != null){
            
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;
            
            int cs = l1_val+l2_val+carry;
            
            carry = cs/10;
            int ld = cs%10;
            
            ListNode nn = new ListNode(ld);
            
            curr.next = nn;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            
            curr = curr.next;
            
        }
        
        if(carry > 0){
            
            ListNode n = new ListNode(carry);
            
            curr.next = n;
            curr = curr.next;
            
        }
        
        return temp.next;
        
    }
}