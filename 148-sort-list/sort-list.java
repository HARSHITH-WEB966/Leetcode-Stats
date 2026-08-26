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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        int c=0;
        ListNode curr=head;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        int arr[]=new int[c];
        curr=head;
        for(int i=0;i<c;i++){
            arr[i]=curr.val;
            curr=curr.next;
        }
        // for(int i=0;i<c-1;i++){
        //     for(int j=i+1;j<c;j++){
        //         if(arr[i]>arr[j]){
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        Arrays.sort(arr);
        curr=head;
        for(int i=0;i<c;i++){
            curr.val=arr[i];
            curr=curr.next;
        }

        return head;
    }
}