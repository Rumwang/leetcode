/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode pointer = prehead;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                pointer.next = l1;
                l1 = l1.next;
            }
            else{
                pointer.next = l2;
                l2 = l2.next;
            }
            pointer = pointer.next;
        }
        pointer.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
}