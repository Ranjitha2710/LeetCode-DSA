
DATE : 01-NOV-2025
LEVEL : Medium
TOPIC : Linked List

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(n==size){ //Head is to be delted
            return head.next;
        }
        int idxOfprevNode=size-n; //prev node index of deleting node 
        int i=1;
        ListNode prev=head;
        while(i<idxOfprevNode){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}