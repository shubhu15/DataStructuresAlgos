package LinkedList.Hard;

import LinkedList.ListNode;

public class ReverseLinkedListInKGroups {

//    https://leetcode.com/problems/reverse-nodes-in-k-group/
    public ListNode reverseKGroup(ListNode head, int k) {

        if(k<=1 || head ==null)
            return head;

        ListNode current = head;
        ListNode prev =null;

        int length = getLength(head);

        int count = length/k;

        while(count>0){

            ListNode nextNode = current.next;

            ListNode lastprev = prev;
            ListNode newEnd = current;

            for(int i =0; i<k && current!=null; i++){
                current.next = prev;
                prev = current;
                current = nextNode;
                if(nextNode!=null)
                    nextNode = nextNode.next;

            }

            if(lastprev !=null)
                lastprev.next = prev;
            else
                head = prev;

            newEnd.next = current;
            prev = newEnd;
            count--;

        }

        return head;
    }

    int getLength(ListNode head){

        int len=0;
        ListNode n =head;
        while(n!=null){
            len++;
            n=n.next;
        }

        return len;

    }
}
