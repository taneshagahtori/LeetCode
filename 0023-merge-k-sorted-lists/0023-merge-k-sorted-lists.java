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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq= new PriorityQueue<>((x,y)->x.val-y.val);
        ListNode dummy=new ListNode(0);
        ListNode curr= dummy;
        
        for(int i=0; i<lists.length; i++){
            if(lists[i]!=null){
                pq.add(lists[i]);
            }
        }
        while(!pq.isEmpty()){
            ListNode node=pq.poll();
            if(node.next!=null){
                pq.offer(node.next);
            }
            curr.next=node;
            curr=curr.next;
        }
        return dummy.next;
    }
}