package LinkedList.LeetCodeQuestions;

import java.util.HashSet;

public class LinkedListCycle {

//    https://leetcode.com/problems/linked-list-cycle/
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean hasCycle(ListNode head) {

        ListNode slow=head, fast =head;



        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;

            if(fast == slow)
                return true;
        }

        return false;
    }

//    find the length of the cycle present
    public int findLength(ListNode head) {

        ListNode slow=head, fast =head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;

            if(fast == slow)
                return calculateLen(fast, slow);
        }


        return 0;
    }

    private int calculateLen(ListNode fast, ListNode slow) {

        int len =0;
       do {
           slow = slow.next;
           len++;
       }while (slow!=fast);

        return len;
    }

    public boolean hasCycle2(ListNode head) {

        HashSet<ListNode> hs = new HashSet();

        if(head==null)
            return false;
        if(head.next==null)
            return false;

        ListNode n = head;
        while(n!=null){
            if(!hs.add(n))
                return true;
            n = n.next;
        }

        return false;
    }
}
