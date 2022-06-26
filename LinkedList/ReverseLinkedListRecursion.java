package LinkedList;

public class ReverseLinkedListRecursion {

    private ListNode head;
    private ListNode tail;

    public void recursionReverse(ListNode curr){
        if(curr==tail)
        {
            head = tail;
            return;
        }

        recursionReverse(curr.next);
        tail.next = curr;
        tail = curr;
        tail.next =null;
    }
}
