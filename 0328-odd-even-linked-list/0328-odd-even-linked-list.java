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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode temp1=dummy1;
        ListNode temp2=dummy2;
        ListNode temp=head;
        int count=1;
         
        while(temp!=null){
            if(count%2==0){
                temp2.next=new ListNode(temp.val);
                temp2=temp2.next;
            }
            else{
            temp1.next=new ListNode(temp.val);
            temp1=temp1.next;
            }
            temp=temp.next;
            count++;

        }
        temp1=dummy1;
        temp2=dummy2;
       
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=temp2.next;
        return dummy1.next;

        


        
    }
}