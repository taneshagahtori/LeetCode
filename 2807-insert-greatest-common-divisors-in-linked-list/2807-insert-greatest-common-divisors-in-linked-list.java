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
    
    int gcd(int val1, int val2) {
        int min = Math.min(val1, val2);
        int gcdV = 0;
        for (int i = 1; i <= min; i++) {
            if (val1 % i == 0 && val2 % i == 0) {
                gcdV = i;
            }
        }
        return gcdV;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev = head;
        ListNode curr = prev.next;
        while (curr != null) {
            int gcd = gcd(prev.val, curr.val);

            ListNode newNode = new ListNode(gcd); 
            prev.next = newNode; 
            newNode.next = curr;
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}