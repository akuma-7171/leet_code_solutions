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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        int n;
        ListNode tail = head;
        
        
        for(n=1; tail.next != null; n++){
            tail = tail.next;
        }
        
        tail.next = head;
        
        k = k % n;
        k = n - k;
       
        
        for(int j = k; j > 0; j--){
            tail = tail.next;
        }
       
        
        head = tail.next; 
        
        tail.next = null;
       
        
        
        return head;  
        
    }
}