# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if not list1 and not list2:
            return None
        if not list1:
            return list2
        if not list2:
            return list1


        # list3 = ListNode(0)

        if list1.val<=list2.val:
            # list3.next = list1
            list1.next = self.mergeTwoLists(list1.next, list2)
            return list1


        else:
            # list3.next = list2
            list2.next = self.mergeTwoLists(list1, list2.next)
            return list2


        