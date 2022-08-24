package LinkedList.Easy;

import LinkedList.ListNode;

public class LengthOfCycle {

//    https://practice.geeksforgeeks.org/problems/find-length-of-loop/1
    static int countNodesinLoop(ListNode head)
    {
        //Add your code here.

        ListNode slow=head, fast = head;
        boolean f =false;

        while(fast!=null && fast.next!= null){

            slow = slow.next;
            fast= fast.next.next;

            if(fast == slow){
                f=true;
                break;
            }
        }
        int len =0;
        if(f){

            do{
                slow =slow.next; len++;
            }while(fast!=slow);

        }

        return len;
    }
}
