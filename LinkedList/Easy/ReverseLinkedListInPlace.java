package LinkedList.Easy;

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

    public ListNode reverseList2(ListNode head) {

        ListNode current = head;
        if(head ==null)
            return null;
        ListNode nextNode = current.next;
        ListNode prev = null;

        while(current!=null){
            current.next = prev;
            prev = current;
            current = nextNode;
            if(nextNode!=null)
                nextNode = nextNode.next;
        }

        return prev;

    }
}
