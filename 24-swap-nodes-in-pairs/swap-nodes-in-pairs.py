# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head

        swapped = self.swapPairs(head.next.next)
        temp = head.next
        head.next = swapped
        temp.next = head

        return temp


        
        