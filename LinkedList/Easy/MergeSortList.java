package LinkedList.Easy;

import LinkedList.ListNode;

public class MergeSortList {

    public ListNode sortList(ListNode head) {

        if(head==null || head.next==null)
            return head;
        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left,right);
    }


// HOWW DIFFERENT ???
    public ListNode middleNode(ListNode head) {
        // ListNode fast =head;
//         ListNode mid = head;

//         while(head!=null && head.next!=null){
//             mid =mid.next;
//             head=head.next.next;
//         }

//         return mid;

        ListNode midprev =null;

        while(head!=null && head.next!=null){
            midprev = (midprev==null)? head:midprev.next;
            head =head.next.next;
        }

        ListNode mid = midprev.next;
        midprev.next = null;
        return mid;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode ans = new ListNode();
        ListNode tail = ans;

        while(list1!=null && list2!=null){

            if(list1.val<=list2.val){
                tail.next = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                list2 =list2.next;

            }

            tail = tail.next;
        }

        if(list1!=null){
            tail.next = list1;
        }
        if(list2!=null){
            tail.next = list2;
        }



        return ans.next;
    }
}
