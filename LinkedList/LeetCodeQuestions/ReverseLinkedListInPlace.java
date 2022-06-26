package LinkedList.LeetCodeQuestions;

import LinkedList.ListNode;

public class ReverseLinkedListInPlace {

//    https://leetcode.com/problems/reverse-linked-list/
    public ListNode reverseList(ListNode head) {

        if(head == null)
            return head;

        ListNode prev = null;
        ListNode curr = head;
        // ListNode next = head.next;

        while(curr.next!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }

        curr.next =prev;

        return curr;
    }
}
