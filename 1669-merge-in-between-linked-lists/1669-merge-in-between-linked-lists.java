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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode node1 = list1;
        ListNode node2 = list1;
        for(int i=1;i<=b;i++){
            node2 = node2.next;
            if(i<a)
            node1 = node1.next;
        }
        node1.next = list2;
        while(node1.next!=null)node1=node1.next;
        node1.next = node2.next;
        node2.next = null;
        return list1;
    
    }
}