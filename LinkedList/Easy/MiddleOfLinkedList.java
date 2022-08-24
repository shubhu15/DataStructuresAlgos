package LinkedList.Easy;

public class MiddleOfLinkedList {


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


//    https://leetcode.com/problems/middle-of-the-linked-list/
    public ListNode middleNode(ListNode head) {
        ListNode fast =head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
}
