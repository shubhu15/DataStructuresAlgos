package LinkedList.Medium;

import LinkedList.ListNode;

public class RemoveNthNodeFromLast {

//    https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // ListNode fast =head;
        ListNode slow = head;
        int len =0;

        while(slow!=null){
            len++;
            slow=slow.next;
        }

        n =len-n;
        if(n==0)
            return head.next;
        slow = head;

        ListNode prev= null;
        for(int i =0;i<n &&slow!=null;i++){
            prev=slow;
            slow = slow.next;
        }

        prev.next= slow.next;

        return head;

    }

    public ListNode removeNthFromEnd_OPTIMIZED(ListNode head, int n) {

        // ListNode fast =head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;


        for(int i =0; i<=n; i++)
            fast=fast.next;


        while(fast!=null){
            slow=slow.next;
            fast = fast.next;

        }
        slow.next= slow.next.next;

        return dummy.next;

    }
}
