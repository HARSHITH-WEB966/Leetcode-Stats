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
    public ListNode removeElements(ListNode head, int val) {
      ListNode fake=new ListNode(3000);
      fake.next=head;

    ListNode pointer=fake;
      while(pointer.next!=null){
        if(pointer.next.val==val){
            pointer.next=pointer.next.next;
        }
        else{
            pointer=pointer.next;
        }
      }
      return fake.next;
    }
}