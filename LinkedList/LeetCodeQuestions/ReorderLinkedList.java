package LinkedList.LeetCodeQuestions;

import LinkedList.ListNode;

public class ReorderLinkedList {

    public void reorderList(ListNode head) {

        if(head==null || head.next ==null)
            return;

        ListNode mid = getMiddleNode(head);
        ListNode end = reverse(mid);

        ListNode start = head;
        while(end!=null && start!=null){
            ListNode temp = start.next;
            start.next = end;
            start = temp;
            temp = end.next;
            end.next=start;
            end= temp;
        }


//         setting next of tail to null
        if(start!=null)
            start.next = null;


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
