
DATE : 15-NOV-2025
LEVEL : Medium
TOPIC : Linked List

class Solution {
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        //find mid
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse from mid
        ListNode prev=null;
        ListNode next;
        while(slow!=null){
            next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        //add sums
        int maxSum=0;
        ListNode left=head;
        ListNode right=prev;
        while(right!=null){
            maxSum=Math.max(maxSum,left.val+right.val);
            left=left.next;
            right=right.next;
        }
        return maxSum;
    }
}