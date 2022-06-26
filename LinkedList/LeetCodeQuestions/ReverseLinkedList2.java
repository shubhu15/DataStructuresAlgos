package LinkedList.LeetCodeQuestions;

import LinkedList.ListNode;

public class ReverseLinkedList2 {

    // MEDIUM QUESTION IMPORTANT!!
//    https://leetcode.com/problems/reverse-linked-list-ii/

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(right == left || head ==null)
            return head;

        ListNode prev=null, curr=head;

        // SKIP TO THE LEFT -1 NODE
        for(int i =0; i<left-1;i++){
            prev = curr;
            curr = curr.next;
        }

        ListNode last = prev; // IMPORTANT
        ListNode newEnd = curr; // IMPORTANT
        ListNode next = curr.next;


        // REVERSE BETWEEN LEFT & RIGHT
        for(int i =0; i<right-left+1 && curr!=null ; i++){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next !=null)
                next = next.next;

        }

        // CONNECT THE SAVED NODES!
        if(last!=null)
            last.next =prev;
        else
            head = prev;

        newEnd.next =curr;

        return head;
    }
}
