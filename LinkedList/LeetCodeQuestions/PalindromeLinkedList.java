package LinkedList.LeetCodeQuestions;

import LinkedList.ListNode;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

       ListNode middle = getMiddleNode(head);

       ListNode reverseMiddle = reverse(middle);
       ListNode secondHead = reverseMiddle;



        while(head!=null && secondHead!=null){
            if(head.val!=secondHead.val)
                break;
            head=head.next;
            secondHead=secondHead.next;
        }
        reverse(reverseMiddle);

        return head == null || secondHead == null;

    }

    private ListNode reverse(ListNode middle) {

        ListNode head = middle;
        ListNode prev2=null;
        ListNode next = middle.next;

        while(middle!=null){
            middle.next= prev2;
            prev2 = middle;
            middle=next;
            if(next!=null)
                next = next.next;
        }

        return prev2;
    }

    private ListNode getMiddleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
