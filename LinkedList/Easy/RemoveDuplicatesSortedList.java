package LinkedList.Easy;

public class RemoveDuplicatesSortedList {
//    https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null)
            return head;

        if(head.next == null)
            return head;

        ListNode curr = head;
        ListNode nextt = head.next;

        while(nextt!=null){
            if(curr.val != nextt.val){
                curr.next = nextt;
                curr = nextt;
            }

            nextt = nextt.next;
        }
        curr.next = null;

        return head;
    }


//    using recursion
    public void recursion(ListNode curr, ListNode nextt){
        if(nextt== null)

        {
            curr.next = null;
            return;

        }
        if(curr.val !=nextt.val){
            curr.next = nextt;
            curr = nextt;
        }

        recursion(curr, nextt.next);

    }
}
