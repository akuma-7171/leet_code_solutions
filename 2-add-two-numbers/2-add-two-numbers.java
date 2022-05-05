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
        ListNode current = temp;
        
        int carry = 0;
        
        while(l1 != null || l2 != null){
            
            int lv1 = (l1 != null) ? l1.val : 0;
            int lv2  =(l2 != null) ? l2.val : 0;
            
            int cs = lv1 + lv2 + carry;
            
             carry = cs/10;
            int ld = cs%10;
            
            ListNode nn = new ListNode(ld);
            
            current.next = nn;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            
            current = current.next;
            
        }
        
        if(carry > 0){
            
            ListNode n = new ListNode(carry);
            
            current.next = n;
            
            current = current.next;
            
        }
        
        
        return temp.next;
        
    }
}