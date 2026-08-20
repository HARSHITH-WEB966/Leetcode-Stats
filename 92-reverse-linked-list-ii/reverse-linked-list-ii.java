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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode fake=new ListNode(0);
        fake.next=head;

        ListNode beforeleft=fake;
        for(int i=1;i<left;i++)  beforeleft=beforeleft.next;
        ListNode cur=beforeleft.next;
        for(int i=0;i<right-left;i++){
            ListNode nextnode=cur.next;
            cur.next=nextnode.next;
            nextnode.next=beforeleft.next;
            beforeleft.next=nextnode;
        }
        return fake.next;
    }
}