package LinkedList.LeetCodeQuestions;

public class LinkedListCycle2 {

//    https://leetcode.com/problems/linked-list-cycle-ii/
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode detectCycle(ListNode head) {

        ListNode slow=head, fast =head;
        int length=0;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;

            if(fast == slow)
            {
                length= calculateLen(fast, slow);
                break;
            }}

        if(length ==0)
            return null;

        ListNode f=head, s=head;
        for(int i=0;i<length;i++)
            s=s.next;

        while(f!=null){
            if(f==s)
                return f;
            f=f.next;
            s=s.next;
        }

        return null;



    }

    int calculateLen(ListNode fast, ListNode slow) {

        int len =0;
        do {
            slow = slow.next;
            len++;
        }while (slow!=fast);

        return len;
    }

}
