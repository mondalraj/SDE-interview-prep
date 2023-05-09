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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();

        dummy.next = head;

        // 1st Pointer
        ListNode p1 = dummy;

        // 2nd Pointer
        ListNode p2 = head;

        // Moving the p2 till nth node from the head;
        while(p2 != null && n > 0){
            p2 = p2.next;
            n--;
        }

        // Moving p2 at the end of the list
        while(p2 != null){
            p2 = p2.next;
            p1 = p1.next;
        }

        // Deleting the p1.next node
        p1.next = p1.next.next;


        return dummy.next;

        // dummy
        // null -> 1 -> 2 -> 3 -> 4 -> 5 -> null
        //                   p1             p2
    }
}